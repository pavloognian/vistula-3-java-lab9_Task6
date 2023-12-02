import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class task3 {
    public static void main(String[] args){
            int b;
            try(FileInputStream fis = new FileInputStream("s.txt"); FileOutputStream fos = new FileOutputStream("copy.txt")){
                do{
                    b = fis.read();
                    System.out.println(b);
                    if((char)b==' ') b='-';
                    if(b!=-1) fos.write(b);
                } while(b != -1);
            }
             catch (IOException e) {
                System.out.printf("Error", e);
            }
        }
}



