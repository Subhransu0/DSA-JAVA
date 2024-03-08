// To find out whether the given String is Palindrome or not.
import java.util.*;
public class STRINGpalindrome {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String num = in.nextLine();
    int i = 0 ;
    int j = num.length()-1;
    while (i<j) {
        if (num.charAt(i)!=num.charAt(j)) {
            System.out.println("Not a palindrome .");
            System.exit(0);
        }
        i++;
        j--;
    }
    System.out.println("Palindrome .");
    
}
    
}