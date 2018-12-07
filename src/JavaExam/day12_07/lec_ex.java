package JavaExam.day12_07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class lec_ex extends JFrame {
    String g_str;
    lec_ex(){
        setTitle("연습문제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();
        JPanel result = new JPanel();
        JTextArea result_txt= new JTextArea("",7,30);
        result_txt.setVisible(false);
        p1.setLayout(new BorderLayout());
// JPanel p1
        JLabel title = new JLabel("학생정보입력",SwingConstants.CENTER);
        title.setFont(new Font("고딕체",Font.BOLD,30));
//JPanel p2
        JLabel name = new JLabel("이름");
        JTextField name_txt = new JTextField(10);
        JLabel std = new JLabel("학번");
        JTextField std_txt = new JTextField(10);
        p2.add(name);
        p2.add(name_txt);
        p2.add(std);
        p2.add(std_txt);
        // RadioButton //
        JLabel grade = new JLabel("학년 : ");
        ButtonGroup g= new ButtonGroup();
        p3.add(grade);
        JRadioButton radio[]=new JRadioButton[4];
        g_str="1학년";
        for(int i =0; i < radio.length;i++){
            radio[i]=new JRadioButton(i+1+"학년");
            g.add(radio[i]);
            p3.add(radio[i]);
            radio[0].setSelected(true);
            radio[i].addItemListener(new ItemListener(){
                public void itemStateChanged
                        (ItemEvent e){
                    if(radio[0].isSelected())
                        g_str="1학년";
                    else if(radio[1].isSelected())
                        g_str="2학년";
                    else if(radio[2].isSelected())
                        g_str="3학년";
                    else if(radio[3].isSelected())
                        g_str="4학년";
                }
            });
        }
        ////자기소개 부분 //
        JLabel m = new JLabel("자기소개",SwingConstants.CENTER);
        JTextArea text = new JTextArea("",5,25);
        JButton submit = new JButton("확인");
        JButton reset = new JButton("리셋");
        p4.setSize(this.getWidth(),100);
        p4.add(m);
        p4.add(new JScrollPane(text));
        p4.add(submit);
        p4.add(reset);
//확인버튼//
        submit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String str="이름:"+name_txt.getText()+"\n학번:"+std_txt.getText()+"\n학년:"+g_str+"\n자기소개\n"+text.getText()+"\n";
                result_txt.setText(str);
                result_txt.setVisible(true);
            }
        });
        // 리셋버튼
        reset.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String str= "";
                name_txt.setText("");
                std_txt.setText("");
                text.setText("");
                radio[0].setSelected(true);
                result_txt.setText(str);
                result_txt.setVisible(false);
            }
        });
//결과 //
        p4.add(result);
        result.add(result_txt);
        p1.add(title,BorderLayout.NORTH);
        p1.add(p2, BorderLayout.CENTER);
        p1.add(p3, BorderLayout.SOUTH);
        this.add(p1,BorderLayout.NORTH);
        this.add(p4,BorderLayout.CENTER);
        setSize(400,500);
        setVisible(true);
    }
    public static void main(String[]arg){
        new lec_ex();
    }
}
