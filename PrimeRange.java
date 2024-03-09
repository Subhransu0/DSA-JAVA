
// Write a function that returns all prime numbers between two given numbers.
import java.util.Scanner;

public class PrimeRange {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter minimum range : ");
        int n1 = in.nextInt();
        System.out.println("Enter Maximum range : ");
        int n2 = in.nextInt();

        Range(n1, n2);

    }

    static boolean isPrime(int num) {
        if (num < 0) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void Range(int start, int end) {
        System.out.println(" Prime numbers in between range : ");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

}
