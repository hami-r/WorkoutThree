import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinesAndCounts {
    public static void main(String[] args) throws IOException {
        String line = "";
        String paragraph = "";

        int countLines = 0;
        int coundWords = 0;
        int countVowels = 0;

        System.out.println("Enter the text: ");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(isr);

        do
        {
            line = bufferedReader.readLine();
            countLines++;
            String[] splitString = line.split(" ");
            coundWords += splitString.length;
            String lowerLine = line.toLowerCase();
            for (int i=0; i<lowerLine.length(); i++){
                char ch = lowerLine.charAt(i);
                if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'){
                    countVowels ++;
                }
            }
            paragraph = paragraph + line + "\n";
            System.out.println("Enter 'exit' to quit!!!");
        }while(!line.equals("exit"));



        isr.close();
        bufferedReader.close();

        System.out.println(paragraph);
        System.out.println("NO of words = " + (coundWords - 1));
        System.out.println("No of lines = " + (countLines - 1));
        System.out.println("No of vowels = " + (countVowels - 2));
    }
}
