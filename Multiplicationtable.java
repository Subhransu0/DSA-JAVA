
// Take a number as input and print the multiplication table for it.
import java.util.*;

public class Multiplicationtable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number for multiplication table : ");
        int num = in.nextInt();
        int table;
        for (int i = 1; i <= 10; i++) {
            table = num * i;
            System.out.println(num + " X " + i + " = "+table);
        }
             
    }

}