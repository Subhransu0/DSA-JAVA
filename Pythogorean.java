
// Write a function to check if a given triplet is a Pythagorean triplet or not.
// a sqr + b sqr = c sqr 
import java.util.*;

public class Pythogorean {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1st number : ");
        double a = in.nextDouble();
        System.out.println("Enter 2nd number : ");
        double b = in.nextDouble();
        System.out.println("Enter 3rd number : ");
        double c = in.nextDouble();
        if (PYTHAGOREAN(a, b, c)) {
            System.out.println("Yes it is a pythagorean Triplet .");
        } else {
            System.out.println("No it is not a pythagorean Triplet .");
        }

    }

    static boolean PYTHAGOREAN(double a, double b, double c) {
        double MAXIMUM = Math.max(a, Math.max(b, c));
        if (MAXIMUM == a) {
            return a * a == b * b + c * c;
        } else if (MAXIMUM == b) {
            return b * b == a * a + c * c;
        } else {
            return c * c == a * a + b * b;
        }
    }

}