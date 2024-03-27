// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
import java.util.*;
public class Twosum {

    public static void main(String[] args) {
        
        int [] arr = {2,5,9,10};
       
        int target = 7;
        System.out.println(TWOSUM(arr, target));
    }
    static int[] TWOSUM(int [] arr , int target){
        for(int i = 0 ; i<arr.length-1;i++){
            for(int j = i + 1 ; j<arr.length;j++){
                if (arr[i]+arr[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}