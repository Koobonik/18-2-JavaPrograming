package JavaExam.Test1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test1 extends JFrame {
    int i = 3;
    Test1(){
        setTitle("test");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        My m =new My();
        btn1.addActionListener(m);
        btn2.addActionListener(m);
        add(btn1);
        add(btn2);
        setSize(100,100);
        setVisible(true);

    }
    class My implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton b = (JButton)e.getSource();
            b.setText(Integer.toString(i));
            i++;
        }
    }
    public static void main(String []args){
        new Test1();
    }
}
