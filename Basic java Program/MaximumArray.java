//Find Maximum Value in array .
public class MaximumArray {
    public static void main(String[] args) {
        int[] arr = { 55, 66, 70, 90, 36, 21, 55 };
        System.out.println("Maximum value is : " + MAX(arr));

    }

    static int MAX(int[] arr) {
        int Minmum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (Minmum < arr[i]) {
                Minmum = arr[i];
            }
        }
        return Minmum;
    }
}
