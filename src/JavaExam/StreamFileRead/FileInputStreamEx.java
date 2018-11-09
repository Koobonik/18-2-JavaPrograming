package JavaExam.StreamFileRead;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx {
    public static void main(String []args){
        FileInputStream in = null;
        try{
            in = new FileInputStream("~/18-2-JavaPrograming/hihi.ini");


            } catch (FileNotFoundException e1) {
            System.out.println("입출력 오류");
        }

    }
}
