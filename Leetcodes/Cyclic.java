
import java.util.*;

class Cyclic {
    public static void main(String[] args) {
        int arr[] = { 1, 5, 3, 4, 2 };

        CYCLICSORT(arr);
        for (int i : arr) {
            System.out.print(" " + i);
        }

    }

    static void CYCLICSORT(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
