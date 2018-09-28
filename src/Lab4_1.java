import java.util.Scanner;

/*
 *
 * 201504003 구본익
 * 2018-09-28 24:00 까지 과제
 *
 * */

public class Lab4_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("=================");
        System.out.println("201504003 구본익");
        System.out.println("=================");

        System.out.println("원의 반지름을 입력해주세요.");
        Double half_length = sc.nextDouble(); // 반지름 입력
        Circle circle = new Circle(); // 원 객체 생성
        circle.setRadius(half_length); // 입력받은 값으로 객체 생성
        circle.showCircle(); // 원의 넓이 출력
    }
}
