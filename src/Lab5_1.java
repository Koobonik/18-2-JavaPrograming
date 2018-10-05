import java.lang.reflect.UndeclaredThrowableException;
import java.util.Scanner;

/*
 *
 * 201504003 구본익
 * 2018-10-09 24:00 까지 과제
 *
 * */

public class Lab5_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("=================");
        System.out.println("201504003 구본익");
        System.out.println("=================");

        int i = 0;
        System.out.println("Music player");
        System.out.println("1. 음악리스트   2. 음악 추가   0. 끝내기");
        i = sc.nextInt();
        Music[] music = new Music[3]; // 음악리스트 3개를 만듦

        
        if(i == 1) // 음악리스트 보여주기 안에는 for문으로 돌리자!
        {
            System.out.println("음악리스트");
            try {
                for (int j = 0; j < music.length; j++){
                    music[j].result();
                }
            }catch(Exception e){
                System.out.println("결과가 없습니다.");
            }
        }
        else if(i == 2) // 음악 추가하는 부분
        {
            for (int j = 0; j < 3; j++){
                System.out.println("음악 추가!");

                System.out.println(j + 1 + "노래 제목");
                String title = sc.nextLine();
                sc.nextLine(); // 버퍼 제거

                System.out.println("가수");
                String singer = sc.nextLine();

                System.out.println("발매일");
                int day = sc.nextInt();
                // j 번째 객체 생
                music[j] = new Music(title, singer, day);
            }

        }
        else if(i == 0) // 프로그램 종료
        {
            System.out.println("시스템 종료");
        }
    }
}
