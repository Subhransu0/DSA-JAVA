
// Input a year and find whether it is a leap year or not.
import java.util.*;

/**
 * Leapyear
 */
public class Leapyear {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a year : ");
        int year = in.nextInt();
        if (LEAPYEAR(year)) {
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not a leap year.");
        }

    }

    static boolean LEAPYEAR(int year) {
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
               return true;
        }
        return false;
    }
}