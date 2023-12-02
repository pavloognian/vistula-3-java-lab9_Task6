import java.io.*;

public class task4 {
    public static void main(String[] args) {
        String s,s2,res="";

        try(BufferedReader br = new BufferedReader(new FileReader("studentsEN.txt"));FileWriter fw = new FileWriter("5grades.txt")){
            while ((s = br.readLine()) != null){
                System.out.println(s.charAt(s.length()-1));

                if(s.charAt(s.length()-1)=='5'){
                    fw.write(s+"\n");
                }
            }


        }catch (IOException e){
            System.out.printf("ERROR");
            e.printStackTrace();
        }
        finally {
            System.out.print(res);
        }
//        String str;
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        try(){
//            do{
//                str=br.readLine();
//                str.
//            }
//        }
//        catch (IOException e){
//            System.out.printf("ERROR");
//            e.printStackTrace();
//        }
    }
}
