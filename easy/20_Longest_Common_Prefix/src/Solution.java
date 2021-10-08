public class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder();

        for(int i = 0; i < strs[0].length(); ++i) {
            char c = strs[0].charAt(i);
            if(isShared(strs, i, c)) {
                prefix.append(c);
            } else {
                break;
            }
        }
        return prefix.toString();
    }

    private boolean isShared(String[] strs, int i, char c) {
        for (String s : strs) {
            if(i >= s.length()) {
                return false;
            }
            if (s.charAt(i) != c) {
                return false;
            }
        }
        return true;
    }
}
