import java.util.Scanner;

public class Substrings {
    public static void main(String args[])
    {

        Scanner input = new Scanner(System.in);
        String word = input.next();
        System.out.println("All substring are:");
        for (int i = 0; i < word.length(); i++) {
            for (int j = i+1; j <= word.length(); j++) {
                System.out.println(word.substring(i, j));

            }
        }
    }
}
