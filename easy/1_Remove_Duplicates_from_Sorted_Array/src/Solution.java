public class Solution {
//    Input: nums = [0,0,1,1,1,2,2,3,3,4]
//    Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int indexLastUnique = 0;

        for (int i = 1; i < nums.length; ++i) {
            if (nums[indexLastUnique] != nums[i]) {
                indexLastUnique++;
                nums[indexLastUnique] = nums[i];
            }
        }

        return indexLastUnique + 1;
    }
}





































