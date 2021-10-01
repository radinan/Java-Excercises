import java.util.Arrays;

public class Solution {
    public int[] plusOne(int[] digits) {
        int carried = 1;

        for (int i = digits.length - 1; i >= 0; --i) {
            int holder = (digits[i] + carried)/10;
            digits[i] = (digits[i] + carried)%10;
            carried = holder;
        }

        if (carried == 1) {
            int[] newArr = new int[digits.length + 1];
            newArr[0] = 1;
            for (int i = 0; i < digits.length; ++i) {
                newArr[i+1] = digits[i];
            }

            return newArr;
        } else {
            return digits;
        }
    }
}
