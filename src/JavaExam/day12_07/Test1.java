package JavaExam.day12_07;

import javax.swing.*;
import java.awt.*;

public class Test1 extends JFrame {
    Test1(){
        setTitle("버튼예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new FlowLayout());

        ButtonGroup g = new ButtonGroup();
        JRadioButton apple = new JRadioButton("apple");
        JRadioButton cherry = new JRadioButton("cherry");
        JRadioButton apple2 = new JRadioButton("apple2");
        g.add(apple);
        g.add(cherry);
        g.add(apple2);

        add(apple);
        add(cherry);
        add(apple2);


        setSize(400, 400);
        setVisible(true);


    }

    public static void main(String []args){
        new Test1();
    }
}
