package JavaExam.StreamFileRead;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriterEx {
    public static void main(String [] args){
        InputStreamReader in = new InputStreamReader(System.in);

        FileWriter fout = null;
        int c;
        try{
            fout = new FileWriter("test.txt");
            while((c = in.read()) != -1){
                fout.write(c);
            }
            fout.close();
            in.close();
        }catch (IOException e){
            System.out.println("입출력 오류");
        }
    }
}
