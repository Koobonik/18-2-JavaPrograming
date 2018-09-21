import java.util.Scanner;
import java.util.function.UnaryOperator;

public class Main {
    enum Week {월, 화, 수, 목, 금, 토, 일}
    public static void main(String[] args) {
        System.out.println("Hello World!");
        //System.out.println(CircleArea()); // 원의 넓이 출력
        //TypeConversion();
        //ScannerExam();
        //ArithmeticOperator();
        //LogicalOperator();
        //UnaryOperator();
        //SuccessOrFail();
        //MultipleOfThree();
        //Grading();
        //ForSample();
        //WhileSample();
        //String_loop();
        //Star();
        //BreakExample();
        //Label_ex();
        //ArrayAccess();
        //ArrayTest1();
        //ArrayLength();
        foreachEx();
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

    public static void SuccessOrFail(){
        Scanner sc = new Scanner(System.in);

        System.out.print("점수를 입력하시오: ");
        int score = sc.nextInt();
        if(score >= 80)
            System.out.println("축하합니다 합격입니다.");
    }

    public static void MultipleOfThree(){
        Scanner sc = new Scanner(System.in);
        System.out.print("수를 입력하시오 : ");
        int number = sc.nextInt();

        if(number % 3 == 0)
            System.out.println("3의 배수 입니다.");
        else
            System.out.println("3의 배수가 아닙니다.");
    }

    public static void Grading(){
        char grade;
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int score = sc.nextInt();
            if(score >= 90)
                grade = 'A';
            else if(score >= 80)
                grade = 'B';
            else if(score >= 70)
                grade = 'C';
            else if(score >= 60)
                grade = 'D';
            else
                grade = 'F';
            System.out.println("학점은 " + grade + " 입니다.");
        }
    }

    public static void ForSample() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 0;
        for(int i = 0; i<=n; i++){
            num += i;
        }
        System.out.println(num);
    }

    public static void WhileSample() {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        double sum = 0;
        int i = 0;
        while ((i = sc.nextInt()) != 0){
            sum += i;
            n++;
        }
        System.out.println("입력된 개수 " + n + " 개이며 평균은 " + sum/n + " 입니다");
    }

    public static void String_loop(){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        while (!str.equalsIgnoreCase("n") && str.charAt(0) != 'n' ){
            //something
            System.out.println("입력한 문자열 : " + str);
            System.out.println("문자를 입력해주세요 : (n/N을 누르면 종료)");
            str = sc.nextLine();
        }

        do{
            System.out.println("입력한 문자열 : " + str);
            System.out.println("문자를 입력해주세요 : (n/N을 누르면 종료)");
            str = sc.nextLine();
        }while (!str.equalsIgnoreCase("n") && str.charAt(0) != 'n' );

        for (char b = 'a'; b<='z'; b++){
            System.out.println(b);
        }
    }

    public static void Star(){
        for(int i = 0 ; i < 4; i++){
            for(int j = 0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void BreakExample(){
        Scanner sc = new Scanner(System.in);
        int num = 0;

        while(true){
            if(sc.nextInt() == -1)
                break;
            num++;
        }
        System.out.println("입력된 숫자 개수는 " + num);
    }

    public static void Label_ex(){
        for(int i = 0; i<3; i++){
            AA:
            for(int j = 0; j<5; j++){
                if(j==3)
                    break AA;
                System.out.println("i = " + i + " || j = " + j);
            }

        }
    }

    public static void ArrayAccess(){
        Scanner sc = new Scanner(System.in);
        int intArray[] = new int[5];;
        int max = 0;

        for(int i = 0; i<5; i++){
            intArray[i] = sc.nextInt();
            if(intArray[i] > max)
                max = intArray[i];
        }
        System.out.println("입력된 수에서 가장 큰 수는 " + max + " 입니다.");
    }

    public static void ArrayTest1(){
        System.out.println("정렬 프로그램");
        int array[] = {10, 4, 2, 8, 3};
        int tmp;

        for(int i = 0; i<5; i++){
            for(int j = i+1; j<5 ; j++){
                if(array[i] <= array[j]){
                    tmp = array[j];
                    array[j] = array[i];
                    array[i] = tmp;
                }
            }
        }
        for(int i = 0; i<5 ; i++)
            System.out.println(array[i]+ "\t");
    }

    public static void ArrayLength(){
        Scanner sc = new Scanner(System.in);
        int intArray[] = new int[5];
        double sum = 0;

        for(int i = 0 ; i< intArray.length; i++){
            intArray[i] = sc.nextInt();
            sum += intArray[i];
        }
        System.out.println("배열 원소의 평균은 " + sum/intArray.length + " 입니다.");
    }

    public static void foreachEx(){
        int[] num = {1, 2, 3, 4, 5};
        String names[] = {"사과", "배", "바나나", "체리", "딸기", "포도"};
        int sum = 0;

        for (int k : num)
            sum += k;
        System.out.println("합은 " + sum);


        for(String s : names)
            System.out.println(s + " ");
        System.out.println();

        for(Week day : Week.values())
            System.out.println(day + "요일");
        System.out.println();

    }
}