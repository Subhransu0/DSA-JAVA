// Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
import java.util.*;
public class Input0 {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int sum = 0;
    while (true) {
        System.out.println("Enter number or enter 'X' to calculate the sum : ");
        String num = in.nextLine();
        if ((num.equals("x")) || (num.equals("X"))) {
            System.out.println("Game over .");
            break;
        }
        else{
            int num1 = Integer.parseInt(num);
            sum = sum + num1;
           
        }
    }System.out.println("The sum of total is : " + sum);
} 
    
}