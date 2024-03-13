/**
 * BInarySearch
 */
public class BInarySearch {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }; // sorted array in ascending order
        int target = 6;

        System.out.println(SERACH(arr, target));

    }

    static int SERACH(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > mid) {
                start = mid + 1;
            } else if (target < mid) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}