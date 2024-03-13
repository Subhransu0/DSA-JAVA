
// Write a function to find if a number is a palindrome or not. Take number as parameter.
import java.util.Scanner;

public class Plindrome2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num1 = in.nextInt();
        if (PALINDROME(num1)) {
            System.out.println("Palindrome number .");
        } else {
            System.out.println("Not a palindrome number .");
        }
        in.close();
    }
    static boolean PALINDROME(int num) {
        int check = num;
        int palin = 0;
        while (num > 0) {
            int rem = num % 10;
            palin = (palin * 10) + rem;
            num = num / 10;
        }
        if (palin == check) {
            return true;
        } else {
            return false;
        }

    }

}