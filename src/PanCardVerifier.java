import java.util.Scanner;

public class PanCardVerifier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = input.nextLine();
        System.out.println("Enter the pancard number: ");
        String pancard = input.next();
        try {
            validatePancard(pancard,name);
        } catch (InvalidPanException e) {
            System.out.println("Exception Caught");
            System.out.println("Message: " + e);
        } catch (Exception e){
            System.out.println("Write 10 digit pancard!");
        }
    }

    static void validatePancard(String pancard, String name) throws InvalidPanException {
        if(pancard.charAt(4) != name.charAt(0)) {
            throw new InvalidPanException("Invalid Pancard!!!");
        }
        else {
            System.out.println("Valid Pancaard!");
        }
    }
}

class InvalidPanException  extends Exception
{
    public InvalidPanException (String str)
    {
        // calling the constructor of parent Exception
        super(str);
    }
}