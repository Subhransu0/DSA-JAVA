import java.util.Scanner;

class SCANNER {
    Scanner in = new Scanner(System.in);
}

public class ATMmachine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int PIN = 1234;
        int AvailableBALANCE = 10000;
        do {

            System.out.println("Enter PIN : ");
            int PASSWORD = in.nextInt();
            if (PIN == PASSWORD) {
                System.out.println(" WELCOME TO HDFC BANK ");
                System.out.println(" 1: WITHDRAW CASH");
                System.out.println(" 2: DEPOSIT CASH");
                System.out.println(" 3: CHECK BALANCE");
                System.out.println(" 4: ACCOUNT DETAILS");
                System.out.println(" 5: EXIT");
                System.out.println();

            } else {
                System.out.println("Enter a valid PIN !!.");

            }
            System.out.println("Enter any operation 1 to 5 : ");
            int OPERATION = in.nextInt();
            switch (OPERATION) {
                case 1:
                    int a = WITHDRAW(AvailableBALANCE);
                    if (WITHDRAW(AvailableBALANCE) == -1) {
                        System.out.println("Invalid operation");
                        break;
                    } else {
                        System.out.println("Withdraw Successful");
                    }

                    break;
                // case 2:
                // DEPOSIT();
                // break;
                // case 3:
                // CHECKBALANCE();
                // break;
                // case 4:
                // ACCOUNTDETAILS();
                // break;
                // case 5:
                // EXIT();
                // break;

                default:
                    break;
            }

        } while (true);
    }

    static int WITHDRAW(int amount) {
        SCANNER obj = new SCANNER();
        while (amount > 0) {
            
        
        System.out.println("Enter amount to Withdraw : ");
        int cash = obj.in.nextInt();
        
            if (cash % 100 == 0) {
                cash = amount - cash;

            } 
        }
        
        return -1;
    }

}
