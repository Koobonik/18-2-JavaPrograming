import java.util.Scanner;

/*
 *
 * 201504003 구본익
 * 2018-09-14 24:00 까지 과제
 *
 * */

public class Lab2_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("=================");
        System.out.println("201504003 구본익");
        System.out.println("=================");

        System.out.println("영어 문자를 하나만 입력해주세요");
        String str = sc.nextLine();

        // 문자열 길이는 1 이면서 대문자, 소문자 true일 경우
        if(str.length() == 1 && (Character.isLowerCase(str.charAt(0)) == true || Character.isUpperCase(str.charAt(0)) == true))
        {
            if(Character.isUpperCase(str.charAt(0)) == true) // 첫 문자가 대문자 일경우
            {
                System.out.println(str.charAt(0) + " 은 대문자 입니다.");
            }
            else if(Character.isLowerCase(str.charAt(0)) == true) // 첫 문자가 소문자 일경우
            {
                System.out.println(str.charAt(0) + " 은 소문자 입니다.");
            }
        }
        // 문자열 길이가 1이 아니면서 대문자, 소문자도 아닌 글자가 들어왔을 경우 (ex 숫자, 한글, 한문)
        else if(str.length() != 1 || (Character.isUpperCase(str.charAt(0)) == true || Character.isLowerCase(str.charAt(0)) == true))
        {
            System.out.println(str + " 중 가장 앞에있는 " + str.charAt(0) + " 만 인식됩니다..");
            if(Character.isUpperCase(str.charAt(0)) == true) // 첫 문자가 대문자 일경우
            {
                System.out.println(str.charAt(0) + " 은 대문자 입니다.");
            }
            else if(Character.isLowerCase(str.charAt(0)) == true) // 첫 문자가 소문자 일경우
            {
                System.out.println(str.charAt(0) + " 은 소문자 입니다.");
            }
            else // 대문자도 소문자도 아닐 경우
            {
                System.out.println(str.charAt(0) + " 은 알파벳이 아닙니다.");
            }
        }


    }
}
