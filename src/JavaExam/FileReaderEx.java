package JavaExam;

import javax.swing.text.Style;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
    public static void main (String [] args){
        FileReader in = null;
        try{
            // 파일로부터 문자 입력 스트림 생성
            in = new FileReader("~/18-2-JavaPrograming/src/test.out");
            int c;
            while((c = in.read()) != -1){
                System.out.println((char)c);
            }
        } catch (IOException e) {
            System.out.println("입출력 오류");

        }
    }
}
