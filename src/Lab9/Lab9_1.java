package Lab9;

import javax.swing.*;
import java.awt.*;

public class Lab9_1 extends JFrame {
    JPanel panel_1;
    JPanel panel_2;
    JLabel text;

    JLabel number[]; // 공유를 위하여 멤버 변수로 선언
    Lab9_1(){
        setTitle("구본익");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로세스 종료
        text = new JLabel("시작합니다.");
        panel_2 = new JPanel();
        panel_1 = new JPanel(); // FlowLayout
        number = new JLabel[3];
        for (int i = 0; i<number.length; i++){
            number[i] = new JLabel("0");
            panel_1.add(number[i]);
        }
        panel_2.add(text);
        add(panel_2, BorderLayout.NORTH);
        add(panel_1);
        setSize(300,200);
        setVisible(true);
    }

    public static void main(String args[]){
        new Lab9_1();
    }
}
