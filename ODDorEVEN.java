
// Define a program to find out whether a given number is even or odd.
import java.util.Scanner;

public class ODDorEVEN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to check odd or even : ");
        int num = in.nextInt();
        if (EVEN(num)) {
            System.out.println("Even number .");
        } else {
            System.out.println("Odd number .");
        }
        in.close();
    }

    static boolean EVEN(int num) {
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }

}