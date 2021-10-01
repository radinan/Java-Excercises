import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap();

        for (int i = 0; i < nums.length; ++i) {
            int result = target - nums[i];

            if (numsMap.containsKey(result)) {
                return new int[] {i, numsMap.get(result)};
            }
            numsMap.put(nums[i], i);
        }

        return new int[] {};
    }
}
