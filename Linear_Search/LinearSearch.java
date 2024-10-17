import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("Enter the Target");
        int target = sc.nextInt();

        int ans = linearsearch2(arr, target);
        System.out.println(ans);

    }

    static int linearsearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;

        } else {
            for (int index = 0; index < arr.length; index++) {
                int element = arr[index];
                if (element == target) {
                    return index;
                }

            }
        }

        return -1;
    }

    static int linearsearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;

        } else {
            for (int element : arr) {
                if (element == target) {
                    return element;
                }

            }
        }

        return Integer.MAX_VALUE;
    }

    static boolean linearsearch3(int[] arr, int target) {
        if (arr.length == 0) {
            return false;

        } else {
            for (int element : arr) {
                if (element == target) {
                    return true;
                }

            }
        }

        return false;
    }

}
