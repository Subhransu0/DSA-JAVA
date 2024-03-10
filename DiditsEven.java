// Given an array arr of integers , returns How many of them contain an even number of digits
public class DiditsEven {
    public static void main(String[] args) {
        int[] arr = { 12, 357, 9764, 5, 37, 999 };
        System.out.println(Find(arr));

    }

    static int DIGIT(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    static boolean EVEN(int num) {
        int Even = DIGIT(num);
        return Even % 2 == 0;
    }

    static int Find(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (EVEN(i)) {
                count++;
            }
        }
        return count;
    }
}
