
// Write a program to print whether a number is even or odd, also take input from the user (using While loop)
import java.util.Scanner;

public class ODDorEVEN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number to check odd or even : ");
            int num = in.nextInt();
            if (num % 2 == 0) {
                System.out.println("The number is even");
            } else {
                System.out.println("The number is odd");
            }
            in.close();
        }
    }

}