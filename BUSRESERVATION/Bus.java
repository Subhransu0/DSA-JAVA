
import java.util.*;
public class Bus {
    
    Scanner in = new Scanner(System.in);
    int MAX_SEAT = 20;

    public static void main(String[] args) {
        Bus obj = new Bus();
         System.out.println("Welcome to Bus Reservation System ");
         System.out.println("Select Any Option : ");
         System.out.println("1 : Check Available Seat");
         System.out.println("2 : Book your Seat");
         System.out.println("3 : Cancel Your seat booking");
         System.out.println("4 : Exit");




    }

    static void AVAILABLESEAT(){
        Bus obj2 = new Bus();
       System.out.println("Total Available Seat : "+ obj2.MAX_SEAT );
    }
    
}
