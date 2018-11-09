package JavaExam.StreamFileRead;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String [] args){
        try{
            FileOutputStream fout = new FileOutputStream("test.out");
            FileInputStream fin = null;

            for(int i = 0 ; i< 10 ; i++){
                int n = 10 -i;
                fout.write(n);
            }
            fout.close();

            fin = new FileInputStream("test.out");
            int c = 0;
            while ((c = fin.read()) != -1){
                System.out.print(c + " ");
            }
            fin.close();
        } catch (IOException e){
            System.out.println("입출력 오류");
        }
    }
}
