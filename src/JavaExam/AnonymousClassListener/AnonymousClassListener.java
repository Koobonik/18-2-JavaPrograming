package JavaExam.AnonymousClassListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonymousClassListener extends JFrame {
    AnonymousClassListener(){
        setTitle("Action 이벤트 리스너 작성");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(300,300);
        setVisible(true);
        JButton btn = new JButton("Action");
        add(btn);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton)e.getSource();
                if(b.getText().equals("Action"))
                    b.setText("액션");
                else
                    b.setText("Action");
                setTitle(b.getText());
            }
        });

    }
    public static void main(String []args){
        new AnonymousClassListener();
    }
}
