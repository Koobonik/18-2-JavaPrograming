import java.util.Scanner;

/*
 *
 * 201504003 구본익
 * 2018-09-27 24:00 까지 과제
 *
 * */

public class Lab3_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("=================");
        System.out.println("201504003 구본익");
        System.out.println("=================");

        System.out.println("입력받고 싶은 개수를 입력 : ");

        int max = 0, min; // 최대값, 최소값
        int num = sc.nextInt(); // 입력받고 싶은 정수의 개수를 담을 변수
        int intArray[] = new int[num]; // num의 수만큼 배열 생성
        System.out.println(num + "개의 정수를 입력해주세요.");

        for(int i = 0 ; i < num ; i++)// num만큼 반복
        {
            System.out.print(i + 1 + " : "); // 단순 숫자 출력이므로 i+1
            intArray[i] = sc.nextInt();
            if(max <= intArray[i]){ // 최대값 구하기
                max = intArray[i];
            }
        }
        min = intArray[0];
        for(int i=0; i<num; i++){ // 최소값 구하기
            if(min>intArray[i])
                min=intArray[i];
        }

        System.out.println("최대값  " + max + " 최소값 :" + min);


    }
}
