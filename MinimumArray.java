// Search Minimum value in array .
public class MinimumArray {
    public static void main(String[] args) {
        int [] arr = { 12,98,45,-77,33,100};
        System.out.println(MIN(arr));

    }
    static int MIN(int [] arr)
    {
        int Minimum = arr[0];
        for(int i = 1 ; i < arr.length;i++){
            if (arr[i] < Minimum) {
                Minimum = arr[i];
            }
        }
        return Minimum;
    }

    
}