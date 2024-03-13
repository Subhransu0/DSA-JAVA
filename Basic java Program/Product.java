// Define a method that returns the product of two numbers entered by user.
import java.util.*;
public class Product {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter 2 number : ");
    int num1 = in.nextInt();
    int num2 = in.nextInt();
    int ans = PRODUCT(num1, num2);
    System.out.println("The product of 2 number is "+ans);
    in.close();
}

static int PRODUCT(int a , int b){
    return a*b;
}
    
}