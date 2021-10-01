public class Solution {
    public void moveZeroes(int[] nums) {
        int placeToPut = 0;

        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != 0) {
                nums[placeToPut++] = nums[i];
            }
        }

        for (int i = placeToPut; i < nums.length; ++i) {
            nums[i] = 0;
        }
    }
}