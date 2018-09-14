import java.util.Scanner;

/*
 *
 * 201504003 구본익
 * 2018-09-14 24:00 까지 과제
 *
 * */

public class Lab2_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("=================");
        System.out.println("201504003 구본익");
        System.out.println("=================");

        System.out.println("생년월일을 입력해주세요: (ex: 960130)");
        String birthday = sc.nextLine();

        // 생일의 길이가 6이 아니라면
        if(birthday.length() != 6)
            System.out.println("입력형식이 잘못되었습니다.");

        birthday = birthday.substring(2,4);
        int month = Integer.parseInt(birthday);

        switch (month)
        {
            case 12 : case 1 : case 2:
            {
                System.out.println("겨울에 태어나셨군요");
                break;
            }
            case 3 : case 4 : case 5:
            {
                System.out.println("봄에 태어나셨군요");
                break;
            }
            case 6 : case 7 : case 8:
            {
                System.out.println("여름에 태어나셨군요");
                break;
            }
            case 9 : case 10 : case 11:
            {
                System.out.println("가을에 태어나셨군요");
                break;
            }
            default:
                System.out.println("월 형식이 잘못되었습니다.");
        }
    }
}
