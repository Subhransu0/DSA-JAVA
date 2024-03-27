
// find the greatest number smaller or equal to target (Floor of a number)
import java.util.*;
public class Floor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array element : ");
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter target : ");
        int target = in.nextInt(); 
        System.out.println(FLOOR(arr, target));
    }
    static int FLOOR(int [] arr , int target){
        int start = 0 ;
        int end = arr.length-1;
        boolean Isasc = arr[start] < arr[end];
        while (start <=  end ) {
            int mid = start+ ( end - start)/2;
            if (arr[mid]==target) {
                return mid;
            }
            if (Isasc) {
                if (arr[mid] >= target) {
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else{
                if (arr[mid] <= target) {
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }

        }
        return end;
    }
}