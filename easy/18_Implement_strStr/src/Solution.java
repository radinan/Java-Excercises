public class Solution {
    public static void main(String[] args) {
        strStr("aaa", "aaaa");
    }
    public static int strStr(String haystack, String needle) {
        int hLength = haystack.length();
        int nLength = needle.length();

        if (nLength == 0) {
            return 0;
        }
        if (nLength > hLength) {
            return -1;
        }

        int j = 0;
        boolean started = false;
        int startedIndex = -1;


        for (int i = 0; i < hLength && j < nLength; ++i) {
            if (nLength - 1 - j > hLength - 1 - i) {
                return -1;
            }
            if (haystack.charAt(i) == needle.charAt(j)) {
                if (started) {
                    ++j;
                } else {
                    started = true;
                    startedIndex = i;
                    ++j;
                }
            } else {
                if (started) {
                    j = 0;
                    started = false;
                    i = startedIndex;
                    startedIndex = -1;
                }
            }
        }
        return startedIndex;
    }
}
