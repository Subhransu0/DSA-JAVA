// WAP to perferm SEARCH Opeartion in java .
public class ArraySearch {
    public static void main(String[] args) {
        int [] arr = { 1, 2 , 3 , 4 , 5 , 6, 7};
        int target = 7;
        int result = SEARCH(arr, target);
        System.out.println(result);
    }
    static int SEARCH(int [] arr , int target )
    {
        if (arr.length == 0) {
            return -1;
        }
        for(int i = 0;i<arr.length;i++){
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return 1;
    }

    
}