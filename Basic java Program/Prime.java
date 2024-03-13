
// Define a method to find out if a number is prime or not.
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = in.nextInt();
        if (Isprime(a)) {
            System.out.println("Prime number .");
        } else {
            System.out.println("Not a prime number .");
        }
        in.close();

    }

    static boolean Isprime(int num) {
        int c = 2;
        while (c * c <= num) {
            if (num % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }

}