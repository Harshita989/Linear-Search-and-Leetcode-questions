public class Max_no {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 7, 1, -1 };
        System.out.println(max(arr));
    }

    static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}