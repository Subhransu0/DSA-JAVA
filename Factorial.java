
// Write a program to print the factorial of a number by defining a method named
// 'Factorial'. Factorial of any number n is represented by n! and is equal to 1
// * 2 * 3 * .... * (n-1) *n. E.g.-/
// 4! = 1 * 2 * 3 * 4 = 24 
// 3! = 3 * 2 * 1 = 6 
// 2! = 2 * 1 = 2 
// Also,    
// 1! = 1 
// 0! = 1
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        long num = in.nextLong();
        System.out.println("Factorial of a number is : " + FACTORIAL(num));
    }

    static long FACTORIAL(long num) {
        long fact = 1;
        for (long i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

}