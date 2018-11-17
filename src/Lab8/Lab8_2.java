package Lab8;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
/*
 *
 * 201504003 구본익
 * 2018-11-19 24:00 까지 과제
 *
 * */

public class Lab8_2 extends JFrame {
    Lab8_2(){
        setTitle("구본익 프레임");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 이 코드가 있어야 닫기 버튼 눌렀을때 프로그램 완전 종료
        Container c = getContentPane(); // 하나의 컨테이너를 만든다.

        c.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
        c.add(new JButton("+"));
        c.add(new JButton("-"));
        c.add(new JButton("*"));
        c.add(new JButton("/"));
        c.add(new JButton("="));

        c.add(new JButton("1"));
        c.add(new JButton("2"));
        c.add(new JButton("3"));
        c.add(new JButton("4"));
        c.add(new JButton("5"));

        c.add(new JButton("6"));
        c.add(new JButton("7"));
        c.add(new JButton("8"));
        c.add(new JButton("9"));
        c.add(new JButton("0"));

        c.setBackground(Color.YELLOW);
        setSize(300, 200);
        setVisible(true);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=================");
        System.out.println("201504003 구본익 컴퓨터소프트웨어학과");
        System.out.println("=================");
        new Lab8_2();



    }
}
