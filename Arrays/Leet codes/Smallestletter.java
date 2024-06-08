public class Smallestletter {
    public static void main(String[] args) {
        char [] arr = {'e' , 'h' , 'k' , 'o'};
        char target = 'f';
        System.out.println(SMALL(arr, target));
        
    }
    static char SMALL(char [] arr , char target){
        int start = 0;
        int end = arr.length-1;
        while (end >=  start) {
            int mid = start + (end - start)/2;
            if (arr[mid]>target) {
                end = mid - 1;

            }
            else{
                start = mid + 1;
            }
        }
        return arr[start % arr.length];
    }
}
