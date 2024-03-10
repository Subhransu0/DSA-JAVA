//WAP to find MINIMUM AND MAXIMUM in A Multidimesnional Array.
public class MINMAX2D {
    public static void main(String[] args) {
        int[][] arr = {
                { 12, 23 },
                { 63, 77, 91, 20 },
                { 36, 3, 8, 9, 1 },
                { 500 }
        };

        System.out.println("The maximum value is " + MAX(arr));
        System.out.println("The minimum value is " + MIN(arr));
    }

    static int MAX(int[][] arr) {

        int ans = Integer.MIN_VALUE;

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (ans < arr[row][col]) {
                    ans = arr[row][col];
                }
            }
        }
        return ans;
    }

    static int MIN(int[][] arr) {

        int ans = arr[0][0];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (ans > arr[row][col]) {
                    ans = arr[row][col];
                }
            }
        }
        return ans;
    }
}
