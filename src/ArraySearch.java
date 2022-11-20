import java.util.Arrays;
import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {

            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the size of the array: ");
                int size = scanner.nextInt();
                int arr[] = new int[size];
                for(int i = 0; i < size; i++) {
                    System.out.print("Enter the elements " + (i+1) + ": ");
                    arr[i] = scanner.nextInt();
                    boolean isFound = false;
                    System.out.print("Enter the number you want to search: ");
                    int number = scanner.nextInt();
                    isFound = searchArray(arr,number);
                    foundOrNot(isFound);
                    sortArray(arr);
                }
            } catch (Exception e) {
                System.out.println("Exception found.. Try again!  \nException found was " + e.toString());
            }

    }

    public static void sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = 0;
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(arr[i]);
        }
    }


    static boolean searchArray(int arr[],int number){
        for (int num: arr) {
            if(num == number) {
                return true;
            }
        }
        return false;
    }

    static void foundOrNot(boolean bool) {
        if(bool){
            System.out.println("Found");
        }
        else {
            System.out.println("Not found");
        }
    }


}
