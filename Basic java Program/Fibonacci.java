
// To calculate Fibonacci Series up to n numbers.
//0,1,1,2,3,5,8,13,21,34,55....
import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while (num >= count) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;
            System.out.println(b);
        }
        in.close();
    }

}