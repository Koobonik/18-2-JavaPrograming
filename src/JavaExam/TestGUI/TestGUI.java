package JavaExam.TestGUI;

import java.awt.*;
import javax.swing.*;
public class TestGUI extends JFrame{
    TestGUI(){
        setTitle("GUI 연습");
        setLayout(new FlowLayout());
        add(new JButton("OK"));
        add(new JButton("x"));
        setSize(300, 100);
        setVisible(true);
    }
    public static void main(String[] args) {
        new TestGUI();
    }
}
