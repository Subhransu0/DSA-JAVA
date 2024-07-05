public class BUBLEsort {
    public static void main(String[] args) {
        int [] arr = {5,9,8,3,4,6,1,2,7};
        BUBBLE(arr);
        for (int i : arr) {
            System.out.print( i + " , ");
        }
        
    }
    static void BUBBLE(int[]arr){
        boolean swapped ;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j-1] > arr[j]){
                    int temp = arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1]= temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        
    }
}
