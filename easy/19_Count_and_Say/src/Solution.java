public class Solution {
    public static void main(String[] args) {
        String s = countAndSay(4);
    }

    public static String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }

        return say(countAndSay(n - 1));
    }

    private static String say(String s) {
        char curr = s.charAt(0);
        int countDup = 1;
        StringBuilder newString = new StringBuilder(new String());

        for (int i = 1; i < s.length(); ++i) {
            if (s.charAt(i) == curr) {
                countDup++;
            } else {
                newString.append(countDup).append(curr);
                countDup = 1;
                curr = s.charAt(i);
            }
        }
        newString.append(countDup).append(curr);

        return newString.toString();
    }
}
