// Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
import java.util.*;
public class Greatestamong3 {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter 3 number : ");
    int num1 = in.nextInt();
    int num2 = in.nextInt();
    int num3 = in.nextInt();
    System.out.println("The maximum among 3 number is : " + MAXIMUM(num1, num2, num3));
    System.out.println("The minimum among 3 number is : " + MINIMUM(num1, num2, num3));
    in.close();

}
static int MAXIMUM(int a , int b , int c){
    return Math.max(a, Math.max(c, b));
}
static int MINIMUM(int a , int b , int c)
{
    return Math.min(a, Math.min(c, b));
}
    
}