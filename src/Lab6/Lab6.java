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
        System.out.println("201504003 구본익 컴퓨터소프트웨어학과");
        System.out.println("=================");

        boolean doYouWantContinue = true;
        do{
            System.out.println("영웅을 선택해주세요");
            System.out.println("1. 솔저   2. 트레이서      0. 끝내기");
            int choice = 0;

            // 잘못 입력할 경우 처리
            try {
                choice = sc.nextInt();
                // 1 2 0 이외에 다른 값을 입력했을 경우 처리
                if (!(choice == 1 || choice == 2 || choice == 0)){
                    System.out.println("잘 못 선택하셨습니다.");

                }
            } catch (Exception e){
                System.out.println("숫자만 입력해주세요.");
            }

            // 솔저일 경우
            if (choice == 1) {
                // 솔저 객체 생성
                Soldier soldier = new Soldier();

                //솔저의 정보 출력
                soldier.info();

                //솔저의 메뉴 출력
                soldier.menu(sc);
            }

            // 트레이서 일 경우
            else if( choice == 2) {
                // 트레이서 객체 생성
                Tracer tracer = new Tracer();

                // 트레이서의 정보 출력
                tracer.info();

                // 트레이서의 메뉴 출력
                tracer.menu(sc);
            }
            else if (choice == 0){
                doYouWantContinue = false;
                System.out.println("종료");
            }

        } while (doYouWantContinue);


    }
}
