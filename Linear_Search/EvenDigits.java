import java.math.*;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = { 12, 345, 2, 6, 7896 };
        int ans = findNumbers(nums);
        System.out.println(ans);
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;

            }

        }

        return count;

    }

    private static boolean even(int num) {
        if (countnum(num) % 2 == 0) {
            return true;

        }
        return false;

    }

    static int countnum(int num) {
        if (num < 0) {
            num = num * (-1);

        }
        if (num == 0) {
            return 1;
        }
        return (int) (Math.log10(num)) + 1;
        // int count = 0;
        // while (num > 0) {
        // count++;
        // num = num / 10;
        // }
        // return count;
    }

}
