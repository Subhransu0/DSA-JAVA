//WAP To perferm search operation IN Multidimensional array .2D.

import java.util.Arrays;
public class MULTIarray {

    public static void main(String[] args) {
        int[][] arr = {
                { 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 34, 45, 56, 76 },
                { 1, 3, 8, 9 },
                { 99 }
        };

        int target = 99;
         System.out.println(Arrays.toString(SEARCH(arr, target)));
        

    }

    static int[] SEARCH(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                int element = arr[row][col];
                if (element == target) {
                    return new int[] { row, col };
                }
            }
        }
        return new int[] { -1, -1 };
    }
}