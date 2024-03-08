// Input currency in rupees and output in USD
import java.util.*;
public class USDtoRUPPE {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    System.out.println("Enter INR : ");
    double INR = in.nextDouble();
    double Exchangerate_per_Dollar = 82.70;
    double USD = INR / Exchangerate_per_Dollar;
    System.out.println("Convert rupees to USD :  " + USD+"$");

}
    
}