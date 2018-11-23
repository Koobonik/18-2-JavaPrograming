package Lab9;

import JavaExam.MouseAdapterEx.MouserAdapterEx;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/*
 *
 * 201504003 구본익
 * 2018-11-27 24:00 까지 과제
 *
 * */

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
        panel_1.addMouseListener(new MyMouseAdapter()); // 아무곳에나 클릭해도 작동
        panel_2.addMouseListener(new MyMouseAdapter());
        for (int i = 0; i<number.length; i++){
            number[i] = new JLabel("0");
            panel_1.add(number[i]);
        }
        panel_2.add(text); // 맨 위의 라벨
        add(panel_2, BorderLayout.NORTH);
        add(panel_1);
        setSize(300,200);
        setVisible(true);
    }
    class MyMouseAdapter extends MouseAdapter {
        public void mousePressed(MouseEvent e) {
            System.out.println("asdsd");
            panel_1.removeAll();
            for (int i = 0; i<number.length; i++){
                int x = (int)(Math.random()*5);

                System.out.println("여기 되나 " + x);
                number[i] = new JLabel(Integer.toString(x)); // 랜덤으로 다시 라벨에 숫자입력
                panel_1.add(number[i]);
                add(panel_1);
            }
            if (number[0] == number[1] || number[1] == number[2] ) {

            }
            panel_2.add(text); // 맨 위의 라벨
            add(panel_2, BorderLayout.NORTH);
            add(panel_1);
            setSize(300,200);
            setVisible(true);

        }
    }


    public static void main(String args[]){
        System.out.println("=================");
        System.out.println("201504003 구본익 컴퓨터소프트웨어학과");
        System.out.println("=================");
        new Lab9_1();

    }
}
