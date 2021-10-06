public class Solution {
    public static void main(String[] args) {
        String s = "0P";
        isPalindrome(s);
    }

    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        int length = s.length();

        for (int i = 0; i < length / 2; ++i) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(length - 1 - i);

            if (Character.isLetter(c1) && Character.isLetter(c2)) {
                if (Character.toLowerCase(c1) != Character.toLowerCase(c2)) {
                    return false;
                }
            } else {
                if (c1 != c2) {
                    return false;
                }
            }
        }
        return true;
    }
}
