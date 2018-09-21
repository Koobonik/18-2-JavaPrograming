import java.util.Scanner;

/*
 *
 * 201504003 구본익
 * 2018-09-27 24:00 까지 과제
 *
 * */

public class Lab3_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("=================");
        System.out.println("201504003 구본익");
        System.out.println("=================");

        System.out.println("입력할 학생의 수를 입력해주세요.");
        int student_num = sc.nextInt(); // 학생 수 입력
        int student_score[] = new int[student_num]; // 학생 생성

        /* ------------------ 입력 단계 -------------------- */
        System.out.println(student_num + " 명의 프로그래밍 점수를 입력해주세요");
        for(int i = 0 ; i < student_num ; i++)// 학생수 만큼 반복
        {
            System.out.print(i + 1 + " : "); // 단순 숫자 출력이므로 i+1
            student_score[i] = sc.nextInt(); // 학생의 점수 입력
        }

        /* ------------------ 결과 화면 -------------------- */
        System.out.println("결과");
        for(int i = 0 ; i < student_num ; i++)// 학생수 만큼 반복
        {
            System.out.print(i + 1 + " : " + student_score[i] + " 점 : "); // 단순 숫자 출력이므로 i+1
            Output_Star(student_score[i]);
            System.out.println();
        }

    }

    // 경우에 따라서 별을 출력해주는 메소드
    public static void Output_Star(int a){
        int b = a/10; // 인자값 a를 10으로 나누었을때 몫만큼 별표 출력해주는 알고리즘으로 가자!
        for(int i =0 ; i < b; i++)
            System.out.print("* ");
    }
}
