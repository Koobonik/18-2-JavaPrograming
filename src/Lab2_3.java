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
            System.out.println("1 ~ 9 숫자를 입력해주세요");
            num = sc.nextInt();

            for (int i = num; i>0 ;i--) // 초기값을 num으로 줘서 띄어쓰기 먼저 주기 // 띄어쓰기 파트
            {
                for (char b = 'a'; b<='z'; b++){
                    System.out.println(b);
                }
            }

        }while(num != 0);


//        for (char b = 'a'; b<='z'; b++){
//            System.out.println(b);
//        }

    }
}
