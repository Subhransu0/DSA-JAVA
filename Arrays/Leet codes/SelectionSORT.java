public class SelectionSORT {
    public static void main(String[] args) {
        int[] arr = {60,0,-55,-12,1,5,100};
        SELECTIONSORT(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
       
    } 
    static void SELECTIONSORT(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            int lastindex = arr.length - i - 1;
            int MAXELEMENT = MAX(arr, 0, lastindex);
            SWAP(arr, MAXELEMENT, lastindex);
        }
    }
    static void SWAP(int [] arr , int first , int second){
        int temp = arr[first];
         arr[first] = arr[second];
         arr[second] = temp;
    }

   
    static int MAX(int [] arr , int start , int end){
        int max = start;
        for (int i = start; i <= end; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
}
