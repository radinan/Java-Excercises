import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {1, 2};
        int k = 3;

        rotate(nums, k);
    }

    public static void rotate(int[] nums, int k) {
        if (nums.length == 1) {
            return;
        }

        int steps = k;
        while (steps > nums.length) {
            steps = steps - nums.length;
        }

        if (nums.length == steps) {
            return;
        }

        for (int i = 0; i < gcd(steps, nums.length); ++i) {
            rotateCycle(nums, steps, i);
        }
    }

    private static void rotateCycle(int[] nums, int k, int iStart) {
        int replaced;
        int iCurr = iStart;
        int moving = nums[iStart];

        do {
            int iNext = (iCurr + k > nums.length - 1) ? (iCurr + k - nums.length) : (iCurr + k);

            replaced = nums[iNext];
            nums[iNext] = moving;

            moving = replaced;
            iCurr = iNext;
        } while (iCurr != iStart);
    }

    private static int gcd(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }

        return gcd(num2, num1%num2);
    }
}
