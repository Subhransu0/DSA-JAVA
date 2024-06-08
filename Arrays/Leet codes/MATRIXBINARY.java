import java.util.Arrays;

public class MATRIXBINARY {
    public static void main(String[] args) {
        int[][] arr = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 28, 29, 37, 49 }
                
        };

        int[] result = BINARY(arr, 10);
        if (result[0] == -1 && result[1] == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Index of element 37: (" + result[0] + ", " + result[1] + ")");
        }
    }

    static int[] BINARY(int[][] arr, int target) {
        int row = 0;
        int col = arr.length - 1;
        while (row < arr.length && col >= 0) {
            if (arr[row][col] == target) {
                return new int[]{row, col};
            }
            if (arr[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }
        return new int[]{-1, -1};
    }
}
