package JavaExam.day12_07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test2 extends JFrame {
    JLabel label = new JLabel();
    JTextField text;
    Test2(){
        setTitle("버튼예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        text = new JTextField(10);
        text.addActionListener(new text());
        add(label, BorderLayout.CENTER);
        add(text, BorderLayout.NORTH);
        setSize(200,200);
        setVisible(true);
    }
    class text implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e){
            label.setText(text.getText());
            text.setText("입력불가");
            text.setEditable(false);
        }
    }
    public static void main(String []args){
        new Test2();
    }
}
