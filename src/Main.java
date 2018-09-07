import java.util.Scanner;
import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int a = 300;
        System.out.println(a);
        System.out.println(CircleArea()); // 원의 넓이 출력
        //TypeConversion();
        //ScannerExam();
        //ArithmeticOperator();
//        LogicalOperator();
        UnaryOperator();
    }


    public static double CircleArea(){
        final double PI = 3.14; // 원주율
        double CircleLength = 10; // 원의 지름
        return (CircleLength/2) * (CircleLength/2) * PI;

    }

    public static void TypeConversion(){
        byte b = 127;
        int i= 0;
        System.out.println(b+i);
        System.out.println(10/4);
        System.out.println(10.0/4);
        System.out.println((char)0x12340041);
        System.out.println((byte)(b+i));
        System.out.println((int)2.9 + 1.8);
        System.out.println((int)(2.9 + 1.8));
        System.out.println((int)2.9 + (int)1.8);
    }

    public static void ScannerExam(){
        Scanner sc = new Scanner(System.in);
//        System.out.println("이름 입력");
//        String UserName = sc.next();
//
//        System.out.println("나이 입력");
//        int UserAge = sc.nextInt();
//
//        System.out.println("키 입력");
//        double UserHeight = sc.nextDouble();

//        System.out.println("유저의 이름: " + UserName+ "\n유저의 나이: " + UserAge + "\n유저의 키:" + UserHeight);

        System.out.println("나이, 신장, 체중을 빈칸으로 분리하여 순ㄴ서대로 입력하세요");
        System.out.println("당신의 나이는 " + sc.nextInt() + " 살 입니다.");
        System.out.println("당신의 신장은 " + sc.nextDouble() + " cm 입니다.");
        System.out.println("당신의 체중은 " + sc.nextDouble() + " kg 입니다.");

    }
    public static void ArithmeticOperator(){
        int time, second, minute, hour;
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요:");
        time = sc.nextInt();
        second = time % 60;
        minute = (time / 60) % 60;
        hour = (time / 60) / 60;
        System.out.println(time + "초는 ");
        System.out.println(hour + "시간, ");
        System.out.println(minute + "분, ");
        System.out.println(second + "초 입니다.");
    }

    public static void LogicalOperator(){
        System.out.println('a' > 'b');
        System.out.println(3 >= 2);
        System.out.println(-1 < 0);
        System.out.println(3.45 <= 2);
        System.out.println(3 == 2);
        System.out.println(3 != 2);
        System.out.println(!(3 != 2));
        System.out.println((3 > 2) && (3 > 4));
        System.out.println((3 != 2) || (-1 > 0));
        System.out.println((3 != 2) ^ (-1 > 0));
    }

    public static void UnaryOperator(){
        int opr = 0;
        opr += 3;
        System.out.println(opr++);
        System.out.println(opr);
        System.out.println(++opr);
        System.out.println(opr);
        System.out.println(opr--);
        System.out.println(opr);
        System.out.println(--opr);
        System.out.println(opr);
    }
}































