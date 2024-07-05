public class InsertionSort {
    public static void main(String[] args) {
        int [] arr = {5,3,4,-1,0,1,2,6,100};
        INSERTION(arr);
        for( int i : arr){
            System.out.print(i + " , ");
        }
    }
    static void INSERTION(int [] arr){
        for(int i = 0 ; i<=arr.length-2 ; i++){
            for(int j = i +1; j > 0 ; j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else{
                    break;
                }
            }
        }
    }

    static void swap(int [] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
