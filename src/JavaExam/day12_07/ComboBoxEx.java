package JavaExam.day12_07;

import javax.swing.*;
import java.awt.*;

public class ComboBoxEx extends JFrame {
    Container contentPane;
    String [] fruits = {"apple", "banana", "kiwi", "mango", "pear",
            "peach", "berry", "strawberry", "blackberry"};
    String [] names = {"kitae", "jaemoon", "hyosoo", "namyun"};
    ComboBoxEx() {
        setTitle("콤보박스 만들기 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());

        // 콤보 박스
        JComboBox strCombo = new JComboBox(fruits);
        contentPane.add(strCombo);
        JComboBox nameCombo = new JComboBox();
        for(int i=0; i<names.length; i++)
            nameCombo.addItem(names[i]);
        contentPane.add(nameCombo);
        setSize(300,300);
        setVisible(true);
    }
    public static void main(String [] args) {
        new ComboBoxEx();
    }
}
