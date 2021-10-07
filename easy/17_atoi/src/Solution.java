public class Solution {
    public static void main(String[] args) {
        myAtoi("   -42");
    }

    public static int myAtoi(String s) {
        s = s.trim();
        if (s.equals("")) {
            return 0;
        }

        int sign = 1,
            start = 0;
        long sum = 0;

        if (s.charAt(0) == '-') {
            sign = -1;
            start++;
        } else if (s.charAt(0) == '+') {
            sign = 1;
            start++;
        }

        for (int i = start; i < s.length(); ++i) {
            if (Character.isDigit(s.charAt(i))) {
                sum = sum*10 + (s.charAt(i) - '0');
                if (sum*sign > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                } else if (sum*sign < Integer.MIN_VALUE) {
                    return Integer.MIN_VALUE;
                }
            } else {
                break;
            }
        }

        return (int)sum*sign;
    }
}
