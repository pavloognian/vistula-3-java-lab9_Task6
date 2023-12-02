import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;

public class task6 {
    public static void main(String[] args) throws IOException{

        URL url = new URL("https://ewib.nbp.pl/plewibnra?dokNazwa=plewibnra.txt");
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(url.openStream()));

        //StringBuilder stringBuilder = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 please.");
        String userInput = scanner.nextLine();

        String line;
        //int count=0;
        while ((line = bufferedReader.readLine()) != null)
        {
            String[] items = line.split("\\s");
            if(Integer.parseInt(items[0])==Integer.parseInt(userInput)){
                String result="";
                int c=0;
                for (int i=0;i<items.length;i++){
                    if(items[i]==""){c++; continue;}
                    if(c<3){
                        if(i==0) result = result+"An abbreviated bank number: " + items[i]+";\n";
                        else if(i==3) result = result+"The name of the bank: " + items[i]+" ";
                        else result+=items[i]+" ";
                    }
                }
                System.out.println(result);
                break;
            }
            //116  	Bank Millennium Sp��ka Akcyjna
            //122  	Bank Handlowo-Kredytowy Sp��ka Akcyjna w Katowicach w likwidacji
            //124  	Bank Polska Kasa Opieki Sp��ka Akcyjna
            //114  	mBank Sp��ka Akcyjna
            //109  	Santander Bank Polska Sp��ka Akcyjna
            //101  	Narodowy Bank Polski


//            if(count<=1000) {
//                stringBuilder.append(line);
//                stringBuilder.append(System.lineSeparator());
//            }
//            else{break;}
//            count++;
        }
        bufferedReader.close();
        //System.out.println(stringBuilder.toString().trim());
    }
}
