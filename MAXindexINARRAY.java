/**
 * example int [][] arr = {
 * {1,5,9}, = 15
 * {3,9,5}, = 17 MAXIMUM is 17 so output is 17.
 * {7,1,2} = 10
 * };
 */
public class Practice {

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 5, 9 },
                { 3, 9, 5 },
                { 7, 1, 2 }
        };
        System.out.println(MAXSUM(arr));

    }

    static int MAXSUM(int[][] arr) {
        int ans = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            int sum = 0;
            for (int col = 0; col < arr[row].length; col++) {
                sum = sum + arr[row][col];
            }

            if (ans < sum) {
                ans = sum;
            }
        }
        return ans;
    }
}