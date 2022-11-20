import java.util.Scanner;

public class UserDefinedException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        try {
            if(isLong(input)) {
                throw new ExceptionLineTooLong();
            } else if(isShort(input)) {
                throw new ExceptionLineTooShort();
            } else {
                System.out.println("Valid input!!!");
            }
        } catch (ExceptionLineTooLong e) {
            System.out.println(e.toString());
        } catch (ExceptionLineTooShort e) {
            System.out.println(e.toString());
        }
    }

    static boolean isLong(String word) {
        return (word.length() > 10);
    }

    static boolean isShort(String word) {
        return (word.length() < 5);
    }
}

class ExceptionLineTooShort extends Exception {

    public ExceptionLineTooShort () {
        super("The input is too short.");
    }

}

class ExceptionLineTooLong extends Exception {

    public ExceptionLineTooLong() {
        super("The input is too long.");
    }
}
