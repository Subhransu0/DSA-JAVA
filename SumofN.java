
// Write a function that returns the sum of first n natural numbers.
import java.util.Scanner;

public class SumofN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = in.nextInt();
        System.out.println("The sum of n natural number is : " + SUM(num));
        in.close();
    }

    static int SUM(int n) {
        int sum = 0;
        if (n < 0) {
            return -1;
        }
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

}