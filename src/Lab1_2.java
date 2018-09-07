import java.util.Scanner;

/*
 *
 * 201504003 구본익
 * 2018-09-07 24:00 까지 과제
 *
 * */

public class Lab1_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("=================");
        System.out.println("201504003 구본익");
        System.out.println("=================");


        // 해당 돈에 해당하는 장수를 저장해둘 변수
        int money_50000, money_10000, money_5000, money_1000, money_500, money_100;


        //금액 입력
        System.out.println("돈을 입력해주세요: ");
        int money = sc.nextInt(); // 금액 입력

        System.out.println("------결과------");

        money_50000 = money/50000; // 5만원권 장수 구하기
        System.out.println("50000원 : " + money_50000 + "장");


        money -= 50000 * money_50000; // 5만원의 장수만큼 빼준값을 다시 money 변수에 대입
        money_10000 = money/10000; // 1만원권 장수 구하기
        System.out.println("10000원 : " + money_10000 + "장");

        money -= 10000 * money_10000; // 1만원권의 장수만큼 빼준값을 다시 money 변수에 대입
        money_5000 = money/5000; // 5천원권 장수 구하기
        System.out.println("5000원 : " + money_5000 + "장");

        money -= 5000 * money_5000; // 5천원권의 장수만큼 빼준값을 다시 money 변수에 대입
        money_1000 = money/1000; // 1천원권 장수 구하기
        System.out.println("1000원 : " + money_1000 + "장" );

        money -= 1000 * money_1000; // 1천원권의 장수만큼 빼준값을 다시 money 변수에 대입
        money_500 = money/500; // 500원 개수 구하기
        System.out.println("500원 : " + money_500 + "장");

        money -= 500 * money_500; // 5백원권의 장수만큼 빼준값을 다시 money 변수에 대입
        money_100 = money/100; // 100원 개수 구하기
        System.out.println("100원 : " + money_100 + "장");

        money -= 100*money_100; // 백원 미만으로 남은 금액 대입

        if(money != 0) // 0원 아니면 남은 금액 출력하고 조건 만족안하면 출력 x
        System.out.println("기타 : " + money + "원");

    }
}
