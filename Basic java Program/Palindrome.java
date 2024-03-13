
// To find out whether the given number is Palindrome or not
import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int palin = 0;
        int check = num;
        while (num > 0) {
            int rem = num % 10;
            palin = (palin * 10) + rem;
            num = num / 10;
        }
        if (check == palin) {
            System.out.println("Palindrome.");
        } else {
            System.out.println("Not a palindrome.");
        }
        in.close();
    }

}