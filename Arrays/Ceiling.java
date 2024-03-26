import java.util.Arrays;
import java.util.Scanner;

/**
 * Celling
 */
public class Ceiling {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[6];
        System.out.println("Enter element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter target : ");

        int target = in.nextInt();
        System.out.println(CELLING(arr, target));

    }
    // return the index smallest number greater than equal to (>=) target .

    static int CELLING(int[] arr, int target) {
        if (target > arr[arr.length - 1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        boolean Isasc = arr[start] < arr[end];
        while (end >= start) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (Isasc) {
                if (target >= arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target <= arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return start;
    }
}