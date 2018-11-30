package JavaExam.day11_30;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyCodeEx extends JFrame {
    JPanel contentPane = new JPanel();
    JLabel la = new JLabel();

    KeyCodeEx(){

        setTitle("Key code 예제: F1 키=초록색, %키 노란색");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(contentPane);
        contentPane.addKeyListener(new MyKeyListener());
        contentPane.add(la);
        setSize(300, 150);
        setVisible(true);
        contentPane.requestFocus();

    }

    class MyKeyListener extends KeyAdapter {
        public void keyPressed(KeyEvent e){
            la.setText(e.getKeyText(e.getKeyCode()));
            if(e.getKeyChar() == '%')
                contentPane.setBackground(Color.YELLOW);
            else if(e.getKeyCode() == KeyEvent.VK_F1)
                contentPane.setBackground(Color.GREEN);
        }
    }
    public static void main(String []args){
        new KeyCodeEx();
    }
}
