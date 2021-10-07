public class Solution {
    public static void main(String[] args) {
        strStr("aaa", "aaaa");
    }
    public static int strStr(String haystack, String needle) {
        if (needle.equals("")) {
            return 0;
        }
        if (needle.length() > haystack.length()) {
            return -1;
        }

        int j = 0;
        boolean started = false;
        int startedIndex = -1;

        for (int i = 0; i < haystack.length() && j < needle.length(); ++i) {
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

        if (j < needle.length()) {
            return -1;
        }

        return startedIndex;
    }
}
