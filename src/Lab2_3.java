import java.util.Scanner;

/*
 *
 * 201504003 구본익
 * 2018-09-14 24:00 까지 과제
 *
 * */

public class Lab2_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("=================");
        System.out.println("201504003 구본익");
        System.out.println("=================");
        int num;

        do{
            System.out.println("1 ~ 9 숫자를 입력해주세요 (끝내려면 0)");
            num = sc.nextInt();

            for (int i = 0; i<num; i++) // 초기값을 num으로 줘서 띄어쓰기 먼저 주기 // 띄어쓰기 파트
            {
                if(num>9 || num<1)
                {
                    // 9보다 크거나 1보다 작으면
                    System.out.println("잘못입력하셨습니다.");
                    break;
                }
                for(int j = num; j> i+1; j--) // 띄어쓰기를 관리해줄 for문
                {
                    System.out.print(" ");
                }
                for (char b = 65; b<=65+(i*2); b++) // 문자가 2개씩 추가될 것이기에 i*2를 해준다.
                {
                    System.out.print(b);
                }
                System.out.println();

            }
        }while(num != 0);

    }
}
