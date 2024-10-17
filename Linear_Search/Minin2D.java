public class Minin2D {
    public static void main(String[] args) {
        int[][] arr = {
                { 2, 3, 4, 5 },
                { 45, 67, 34, 89 },
                { 23, 41, 67 }
        };
        int ans = search(arr);
        System.out.println(ans);
    }

    static int search(int[][] arr) {
        int min = Integer.MAX_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] < min) {
                    min = arr[row][col];
                }

            }

        }
        return min;
    }
}
