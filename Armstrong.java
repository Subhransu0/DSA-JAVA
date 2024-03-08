// To find Armstrong Number between two given number.
// 1*1*1 + 5*5*5 + 3*3*3 = 153 
import java.util.Scanner;
public class Armstrong {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a number : ");
    int num = in.nextInt();
    int check = num;
    int arm = 0;
    while(num > 0) {
        int rem = num % 10;
        arm = (rem*rem*rem) + arm ;
        num = num /10;
    }
    if (arm == check) {
        System.out.println("Armstrong");
    }
    else{
        System.out.println("Not a Armstrong number .");
    }
}
    
}