package Lab7;

import java.util.Random;
import java.util.Scanner;

/*
 *
 * 201504003 구본익
 * 2018-11-06 24:00 까지 과제
 *
 * */

public class Lab7_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=================");
        System.out.println("201504003 구본익 컴퓨터소프트웨어학과");
        System.out.println("=================");

        System.out.println("가위바위보게임");
        boolean a = true;
        int userNum;
        int comNum;
        while (a){
            System.out.println("1. 가위\t2. 바위\t3. 보\t0. 끝내기");
            userNum = sc.nextInt();
            if (userNum == 0){
                System.out.println("게임을 종료합니다.");
                break;
            }

            // 컴퓨터 컨트롤
            comNum = (int)Math.round(1+ Math.random()*2); // 1~3 정수 발생
            switch (comNum){
                case 1:
                    System.out.println("컴퓨터는 가위를 냈습니다.");
                    break;
                case 2:
                    System.out.println("컴퓨터는 바위를 냈습니다.");
                    break;
                case 3:
                    System.out.println("컴퓨터는 보를 냈습니다.");
                    break;
            }

            System.out.println(compare(userNum, comNum));
        }
    }
    static String compare(int user, int com){
            // 유저 가위
            if(user == 1){
                // 컴 가위로 비겼을경우
                if (com == 1)
                    return "비겼습니다.";
                // 컴 바위로 컴퓨터가 이겼을경우 com 인자 = 2
                else if (com == 2)
                    return  "컴퓨터가 이겼습니다.";
                // 컴 보로 유저가 이겼을경우
                else if(com == 3)
                    return "이겼습니다.";
            }
            // 유저가 바위를 냈을경우
            else if (user == 2) {
                // 컴 바위로 비겼을경우
                if (com == 2)
                    return "비겼습니다.";
                // 컴 보로 컴퓨터가 이겼을 경우
                else if(com == 3)
                    return "컴퓨터가 이겼습니다.";
                // 컴 가위로 유저가 이겼을경우
                else if(com == 1)
                    return "이겼습니다.";
            }

            // 유저가 보를 냈을경우
            if (user == 3){
                // 컴 가위일경우 컴퓨터가 이김
                if (com == 1)
                    return "컴퓨터가 이겼습니다.";
                // 컴 바위
                else if(com == 2)
                    return "이겼습니다.";
                // 컴 보
                else if(com == 3)
                    return "비겼습니다.";
            }

        return "1, 2, 3, 0 중에서만 입력해주세요.";
    }
}
