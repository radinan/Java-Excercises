public class Solution {
    public int climbStairs(int n) {
        if (n == 1) return 1;

        int prev1 = 1,
            prev2 = 1;

        for (int i = 0; i < n; i++) {
            int temp = prev1;
            prev1 = prev2;
            prev2 += temp;
        }

        return prev1;
    }
}

