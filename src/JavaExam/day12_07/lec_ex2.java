package JavaExam.day12_07;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class lec_ex2 extends JFrame {
    Container contentPane;
    Vector<String> fruits_List;
    int index;
    JList strList;
    JTextField del_txt;
    lec_ex2() {
        setTitle("연습문제2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();

        JLabel la1 = new JLabel("과일이름입력:");
        JTextField strText = new JTextField(10);

        JButton insert_btn = new JButton("추가");

        p1.add(la1);
        p1.add(strText);
        p1.add(insert_btn);

        fruits_List = new Vector<String>();
        strList = new JList();

        //추가 버튼 이벤트 //
        insert_btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //textField에 있는 값 받아오기
                fruits_List.add(strText.getText());
                strList.setListData(fruits_List);
                strText.setText("");
            }
        });
        add(p1,BorderLayout.NORTH);
        add(new JScrollPane(strList),BorderLayout.CENTER);
        //리스트 선택했을 때 이벤트 발생
        strList.addListSelectionListener(new selectListListener());
        //선택된 아이템 //
        JLabel la2 = new JLabel("선택된 과일:");
        del_txt = new JTextField(10);
        JButton del_btn= new JButton("삭제");
        p2.add(la2);
        p2.add(del_txt);
        p2.add(del_btn);
        add(p2,BorderLayout.SOUTH);
        //리스트에서 삭제 //
        del_btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e ){
                System.out.println(index);
                fruits_List.remove(index);
                strList.setListData(fruits_List);
            }
        });
        setSize(300, 400);
        setVisible(true);
    }
    //리스트 선택 이벤트 //
    class selectListListener implements ListSelectionListener {
        public void valueChanged(ListSelectionEvent event){
            String selection = (String) strList.getSelectedValue();
            index=strList.getSelectedIndex(); //리스트에서 인덱스번호 가져오기
            del_txt.setText(selection);
        }
    }
    public static void main(String[] args) {
        new lec_ex2();
    }
}
