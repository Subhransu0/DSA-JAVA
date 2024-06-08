 class CyclicSort {
    public static void main(String[] args) {
        int arr[] = { 1,5,3,4,2};
        try{

        
        CYCLICSORT(arr);
        for (int i : arr) {
            System.out.println(arr[i]);
        }
    }
    catch(Exception e){
        System.out.println(e);
    }
       
    }
static void CYCLICSORT(int [] arr  ){
    int i = 0;
    while(i < arr.length){
        int correct = arr[i] - 1;
        if(arr[i] != arr[correct]){
            swap(arr , i , correct);
        }else{
            i++;
        }
    }
}
static void swap(int[] arr , int a , int b){
    int temp = a;
     a = b;
     b = temp;
}
}
