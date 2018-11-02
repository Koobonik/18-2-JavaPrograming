package Lab7;


import java.util.StringTokenizer;

/*
 *
 * 201504003 구본익
 * 2018-11-06 24:00 까지 과제
 *
 * */
public class Lab7_2 {
    public static void main(String [] args){
        System.out.println("=================");
        System.out.println("201504003 구본익 컴퓨터소프트웨어학과");
        System.out.println("=================");
        System.out.println("(안!녕@하^세~요)" + " -> " + delChar("(안!녕@하^세~요)", "~!@#$%^&*()"));
        System.out.println("(2 0 1 8\t년\t11 월 2일)" + " -> " + delChar("(2 0 1 8\t년\t11 월 2일)", " \t"));
    }
    static String delChar(String str1, String str2){
        // 스트링 토크나이저 이용해서 특수문자 제거
        StringTokenizer str = new StringTokenizer(str1, str2);
        String sum = "";
        while (str.hasMoreTokens()){
            // 토큰을 바로 주면 안됨. 문자로 변환해주고 보내줘야함
            sum += str.nextToken().toString();
        }
        return sum;
    }
}
