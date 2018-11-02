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
        System.out.println("(2 0 1 8\t년\t11 월 2일)" + " -> " + delChar("(2 0 1 8\t년\t11 월 2일)", " \t()"));
    }
    static String delChar(String str1, String str2){
        StringTokenizer str = new StringTokenizer(str1, str2);
        String sum = "";
        for(int i = 0 ; i < str1.length(); i++){


        }
        while (str.hasMoreTokens()){
            System.out.print(str.nextToken());
        }


        return sum;
    }
}
