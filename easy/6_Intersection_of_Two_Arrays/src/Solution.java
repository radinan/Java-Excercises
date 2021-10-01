import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return getCommonElements(nums1, nums2);
        } else {
            return getCommonElements(nums2, nums1);
        }
    }

    private int[] getCommonElements(int[] longerNum, int[] shorterNum) {
        Map<Integer, Integer> setShorter = new HashMap<>();

        for (int i : shorterNum) {
            setShorter.put(i, setShorter.getOrDefault(i,0)+1);
        }

        int n = 0;
        for (int i : longerNum) {
            if (setShorter.getOrDefault(i, 0) > 0) {
                shorterNum[n++] = i;
                setShorter.put(i, setShorter.get(i) - 1);
            }
        }

        int[] newArr = new int[n];
        for (int i = 0; i < n; ++i) {
            newArr[i] = shorterNum[i];
        }


        return newArr;
    }
}
