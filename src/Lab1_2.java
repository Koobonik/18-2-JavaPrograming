import java.util.Scanner;

public class Lab1_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("=================");
        System.out.println("201504003 구본익");
        System.out.println("=================");


        // 돈 변수
        int money_50000, money_10000, money_5000, money_1000, money_500, money_100, money_Other;


        //금액 입력
        System.out.println("돈을 입력해주세요: ");
        int money = sc.nextInt(); // 이름 입력

        System.out.println("------결과------");

        money_50000 = money/50000;
        System.out.println("50000원 : " + money_50000 + "장"); // 5만원권 나눠주기

        // 1만원권 장수 구하기
        money -= money_50000;
        System.out.println("10000원 : " + money);


        System.out.println("5000원 : " +money);
        System.out.println("1000원 : " );
        System.out.println("500원 : " );
        System.out.println("100원 : " );

    }
}
