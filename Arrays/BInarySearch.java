// WAP to perferm search operation in ascending or descendin order 
public class BInarySearch {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }; // sorted array in ascending order
        int [] arr2 = {100,55,44,33,22,20,19,18,17,15,10,5};
        int target = 14;
        int target2 = 15;

        System.out.println(SERACH(arr, target));
        System.err.println(SERACH(arr2, target2));

    }

    static int SERACH(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        boolean Isasc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (Isasc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                     end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}