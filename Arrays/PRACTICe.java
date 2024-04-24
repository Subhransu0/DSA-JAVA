
public class PRACTICe {
    public static void main(String[] args) {
        int [] arr = {1,5,10,12,14,15};
        System.out.println(Binary(arr, 9));

    }

    static int Binary(int[] arr, int target) {
       int start = 0;
       int end = arr.length -1;
       while(start <= end){
        int mid = start + (end - start)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid] < target){
            start = mid + 1;
        }
        else{
            end = mid - 1;
        }
       }
       return end;
    }
}