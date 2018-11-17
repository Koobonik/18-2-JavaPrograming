package Lab8;

import java.io.*;
import java.util.Scanner;

/*
 *
 * 201504003 구본익
 * 2018-11-19 24:00 까지 과제
 *
 * */

public class Lab8_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=================");
        System.out.println("201504003 구본익 컴퓨터소프트웨어학과");
        System.out.println("=================");
        InputStreamReader in = new InputStreamReader(System.in);


        System.out.println("파일 이름을 쓰세요: (ex : text.txt)");
        String fileName = sc.nextLine(); // 만들어질 파일이름
        System.out.println("파일 이름은 "+fileName);


        System.out.println("파일에 넣을 내용을 추가하세요");
        String content = sc.nextLine(); // 내용을 담아줄 변수 content
        File file = new File(fileName); // 파일 이름으로 파일을 만든다.

        System.out.println();
        FileWriter makeFile = null;
        int c;
        try {
            makeFile = new FileWriter(file, true); // 파일을 만들것이며 이후로도 내용을 계속 저장할 것임. 데이터가 계속 쌓일것임.
            makeFile.write(content); // 아까 입력했던 내용이 들어간다. ex) hello world
            makeFile.flush(); // 이 메소드를 사용함으로써 쌓인 버퍼를 목적지로 내보낸다.
            makeFile.close();
        } catch (IOException e){
            System.out.print("입출력 오류");
        }

        System.out.println("=====파일 내용=====");
        FileReader FR = null;
        try {
            FR = new FileReader(fileName); // 이 파일을 읽을것이다!
            int d;
            while ((d = FR.read()) != -1 ){
                System.out.print((char)d); // 요소들마다 출력해준다!
            }
            FR.close();
            } catch (IOException e){
            System.out.println("입출력 오류");
        }



    }
}
