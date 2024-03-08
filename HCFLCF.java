//HCF and LCF between 2 numbers .
import java.util.Scanner;

public class HCFLCF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st number : ");
        int num1 = scanner.nextInt();
        System.out.println("Enter 2nd number : ");
        int num2 = scanner.nextInt();

        int HCF1 = HCF(num1, num2);
        int LCF1 = LCF(num2, num2);
        System.out.println("HCF is : " + HCF1);
        System.out.println("LCF is : " + LCF1);
        scanner.close();

    }

    static int HCF(int a, int b) {
        int min = Math.min(a, b);
        for (int i = min; i >= 0; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }

    static int LCF(int a, int b) {
        return a * b / HCF(a, b);
    }
}
