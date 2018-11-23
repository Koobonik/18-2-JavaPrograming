package JavaExam.ListenerSample;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListenerSaple extends JFrame {
    ListenerSaple(){
        setTitle("Action 이벤트 리스너 작성");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton btn = new JButton("Action");
        MyActionListner listner = new MyActionListner();
        btn.addActionListener(listner);
        add(btn);
        setSize(300, 150);
        setVisible(true);
    }
    public static void main(String []args){
        new ListenerSaple();
    }

    class MyActionListner implements ActionListener {
        public void actionPerformed(ActionEvent e){
            JButton b = (JButton)e.getSource();
            if(b.getText().equals("Action"))
                b.setText("액션");
            else
                b.setText("Action");
        }
    }
}

