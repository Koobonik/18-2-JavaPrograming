import java.util.Scanner;

/*
* 201504003 구본익
* 2018-09-07 24:00 까지 과제
*
* */

public class Lab1_1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("=================");
        System.out.println("201504003 구본익");
        System.out.println("=================");

        System.out.println("이름을 입력해주세요: ");
        String name = sc.next(); // 이름 입력

        System.out.println(name + "님 학과를 입력해주세요: ");
        String major = sc.next(); // 학과입력

        System.out.println("------점수를 입력해주세요------");
        System.out.println("국어: ");
        int literature_Score = sc.nextInt();

        System.out.println("영어: ");
        int eng_Score = sc.nextInt();

        System.out.println("수학: ");
        int math_Score = sc.nextInt();

        int sum_Score = literature_Score + eng_Score + math_Score;
        double average_Score = ((double)sum_Score/3);
        System.out.println("------결과------");
        System.out.println("이름:" + name + ", 학과: " + major);
        System.out.println("총점:" + sum_Score);
        System.out.printf("평균: %.2f", average_Score);
    }
}
