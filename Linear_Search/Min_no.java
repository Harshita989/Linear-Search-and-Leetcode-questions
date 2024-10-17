
public class Min_no {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 7, 1, -1 };
        System.out.println(min(arr));
    }

    static int min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
