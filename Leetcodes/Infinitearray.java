//Find position of an element in a sorted array of infinite numbers .
public class Infinitearray {
    public static void main(String[] args) {

        int [] arr = {10,20,30,40,50,60,70,80,90,100,110,120,130,140,150};
        int target = 100;
        System.out.println(ans(arr, target));
        
    }

    static int ans(int [] arr , int target ){
        int start = 0;
        int end = 1;
        while(target > arr[end]){
            int newStart = end + 1;
            end = end + (end - start + 1)*2;
            start = newStart;

        }
        return BINARYSEARCH(arr, target, start, end);

    }
    static int BINARYSEARCH(int [] arr , int target , int start , int end){
        while(end>= start ){
            int mid = start +(end - start)/2;
            if (target > arr[mid]) {
                start = mid + 1;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    
}
