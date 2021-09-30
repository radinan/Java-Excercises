import java.util.Arrays;

public class Solution {
    public int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        //we accept that the length is odd number
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i+=2) {
            if (nums[i] != nums[i+1]){
                return nums[i];
            }
        }

        return nums[nums.length -1];
    }
}
