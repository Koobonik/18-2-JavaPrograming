package JavaExam.day11_30;

import javax.swing.*;
import java.awt.*;

public class ButtonImageEx extends JFrame {
    Container contentPane;
    ButtonImageEx() {
        setTitle("버튼에 아이콘 달기 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
        ImageIcon normalIcon = new
                ImageIcon("src/images/normalIcon.gif");
        ImageIcon rolloverIcon = new
                ImageIcon("src/images/rolloverIcon.gif");
        ImageIcon pressedIcon = new
                ImageIcon("src/images/pressedIcon.gif");
        JButton btn = new JButton("call~~", normalIcon);
        btn.setRolloverIcon(rolloverIcon);
        btn.setPressedIcon(pressedIcon);
        contentPane.add(btn);
        setSize(250,200);
        setVisible(true);
    }
    public static void main(String [] args) {
        new ButtonImageEx();
    }
}
