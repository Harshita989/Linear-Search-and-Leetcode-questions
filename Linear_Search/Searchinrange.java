
public class Searchinrange {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 6, 1, 8, 9 };
        int target = 8;
        int start = 1;
        int end = 7;
        int ans = linearsearch(arr, target, start, end);
        System.out.println(ans);
    }

    static int linearsearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;

        } else {
            for (int index = start; index <= end; index++) {
                int element = arr[index];
                if (element == target) {
                    return index;
                }

            }
        }

        return -1;
    }
}
