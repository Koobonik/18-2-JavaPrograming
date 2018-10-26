package Lab6;

import java.util.Scanner;

/*
 *
 * 201504003 구본익
 * 2018-10-31 24:00 까지 과제
 *
 * */

public class Lab6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=================");
        System.out.println("201504003 구본익");
        System.out.println("=================");


        System.out.println("영웅을 선택해주세요");
        System.out.println("1. 솔저   2. 트레이서      0. 끝내기");
        Hero hero = null;
        hero.menu(sc);


    }
}
