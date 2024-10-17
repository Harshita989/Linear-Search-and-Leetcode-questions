import java.util.Arrays;

public class Searchin2D {
    public static void main(String[] args) {
        int[][] arr = {
                { 2, 3, 4, 5 },
                { 45, 67, 34, 89 },
                { 23, 41, 67 }
        };
        int target = 89;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[] { row, col };
                }
            }

        }
        return new int[] { -1, -1 };
    }
}
