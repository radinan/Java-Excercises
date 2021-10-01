import java.util.Arrays;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0,
            j = 0,
            n = 0;

        while (i < nums1.length && j < nums2.length) {
            if(nums1[i] == nums2[j]) {
                nums1[n++] = nums1[i];
                i++;
                j++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                i++;
            }
        }

        int[] newArr = new int[n];
        for (int k = 0; k < n; ++k) {
            newArr[k] = nums1[k];
        }

        return newArr;
    }
}
