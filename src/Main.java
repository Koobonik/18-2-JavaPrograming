import org.jcp.xml.dsig.internal.dom.DOMBase64Transform;

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
        //foreachEx();
        //SalesRevenue();
        //ReturnArray();
//        Samp a = new Samp(2);
//        a.trans();
//        Book javaBook = new Book("Java JDK", "구본익", 1234);
//        Book holyBible = new Book("Holy", 1);
//        Book emptyBook = new Book();

//        ColorPoint cp = new ColorPoint();
//        cp.set(3,4);
//        cp.setColor("red");
//        cp.showColorPoint();
//        Student s = new Student();
//        s.set();
//        System.out.println(s.getWeight());
        B b;
        b = new B(5);


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
    // 최대값 구하기
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

    public static void SalesRevenue(){
        int intArray[][] = {{90, 90, 110, 100},
                            {120, 110, 100, 110},
                            {120, 140, 130, 150}};
        double sum = 0;

        for(int i = 0 ; i< intArray.length; i++)
            for(int j = 0; j< intArray[i].length; j++)
                sum += intArray[i][j];

        double aver = (double) sum/intArray.length;
        System.out.print("지난 3년간 매출 총액은 " + sum +" 이며 연 평균 매출은 ");
        System.out.printf("%.2f 입니다.\n", aver);
    }

    public static void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("학생 수 만큼 국어, 영어, 수학 점수 입력 받기");
        System.out.print("학생 수 : ");
        int num = sc.nextInt();
        int student[][] = new int [num][3];

        for(int i=0; i<num; i++){
            for(int j=0; j<student[i].length; j++){
                student[i][j] = sc.nextInt();
            }
        }
    }

    public static int[] makeArray(){
        int temp[] = new int[4];
        for(int i=0; i<temp.length; i++)
            temp[i] = i;
        return temp;
    }

    public static void ReturnArray(){
        int intArray[];
        intArray = makeArray();
        for(int i=0; i<intArray.length; i++)
            System.out.println(intArray[i]);
    }
    public class Goods{
        private String name;
        private int price;
        private int numberOfStock;
        private int sold;

        Goods(String name, int price, int numberOfStock, int sold){
            this.name = name;
            this.price = price;
            this.numberOfStock = numberOfStock;
            this.sold = sold;
        }
        String getName(){return name;}
        int getNumberOfStock(){return numberOfStock;}
        int getSold(){return sold;}
    }
    public static void GoodsArray(){
        Goods [] goodsArray;
        goodsArray = new Goods[3];
        Scanner sc = new Scanner(System.in);
    }
    public static void CallByValue(){

    }
    public class Person{
        public String name;
        public int age;
        public Person(String s){
            this.name = s;
        }
        public void setAge(int n){
            this.age = n;
            n++;
        }
    }
    public static class Samp{
        int id;
        public Samp(int x) {this.id = x;}
        public void set (int x) {this.id = x;}
        public int get() {return  this.id;}

        public void trans(){
            Samp ob1 = new Samp(3);
            Samp ob2 = new Samp(4);
            Samp s;

            s = ob2;
            ob1 = ob2;
            System.out.println("ob1.id=" + ob1.id);
            System.out.println("ob1.id=" + ob2.id);
        }

    }

    public static class Book{
        String title;
        String author;
        int ISBN;
        public Book(String title, String author, int ISBN){
            this.title = title;
            this.author = author;
            this.ISBN = ISBN;
        }
        public Book(String title, int ISBN){
            this(title, "Anonymous", ISBN);
        }
        public Book(){
            this(null, null, 0);
            System.out.println("생성자가 호출되었음.");
        }
    }

    static class Point{
        int x, y;
        void set(int x, int y){
            this.x = x;
            this.y = y;
        }
        void showPoint(){
            System.out.println("(" + x + ", " + y + ")");
        }
    }
    static class ColorPoint extends Point{
        String color;
        void setColor(String color){
            this.color = color;
        }
        void showColorPoint(){
            System.out.println(color);
            showPoint();
        }

    }

    static class Person2 {
        int age;
        public String name;
        protected int height;
        private int weight;
        public void setWeight(int weight) { this. weight = weight; }
        public int getWeight() { return weight; }

    }

    public static class Student extends Person2 {
        void set(){
            age = 30;
            name = "홍길동";
            height = 175;
            setWeight(99);
        }
    }

    static class A {
        public A() {
            System.out.println("생성자A");
        }
        public A(int x) {
            System.out.println("매개변수 생성자 A " + x);
        }
    }
    static  class B extends A {
        public B(){
            System.out.println("생성자B");
        }
        public B(int x){
            super(x);
            System.out.println("매개변수 생성자 B " + x);
        }
    }
    static class DObject {
        public DObject next;
        public DObject(){ next = null; }
        public void draw() {
            System.out.println("DObject Draw");
        }
    }
    static class Line extends DObject {
        public void draw(){
            System.out.println("Line");
        }
    }

    static class Rect extends DObject {
        public void draw(){
            System.out.println("Rect");
        }
    }

    static class Circle extends DObject {
        public void draw(){
            System.out.println("Circle");
        }
    }

    

}