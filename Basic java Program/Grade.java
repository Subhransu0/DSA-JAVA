
// Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Math :");
        double MATH = in.nextInt();
        System.out.println("English :");
        double English = in.nextInt();
        System.out.println("Science :");
        double Science = in.nextInt();
        System.out.println("History :");
        double History = in.nextInt();
        System.out.println("Computer :");
        double Computer = in.nextInt();

        double SUM = MATH + English + Science + History + Computer;
        double avg = SUM / 5;
         GRADE(avg);
        in.close();

    }

    static double GRADE(double avg) {
        if (avg >= 91 && avg <= 100) {
            System.out.println("O");
        }
        if (avg >= 81 && avg <= 90) {
            System.out.println("E");
        }
        if (avg >= 71 && avg <= 80) {
            System.out.println("A+");
        }
        if (avg >= 61 && avg <= 70) {
            System.out.println("A");
        }
        if (avg >= 51 && avg <= 60) {
            System.out.println("B");
        }
        if (avg >= 41 && avg <= 50) {
            System.out.println("C");
        }
        if (avg <= 30) {
            System.out.println("Fail.");
        }
        return 1;
    }

}