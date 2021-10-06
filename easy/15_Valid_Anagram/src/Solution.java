import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> word1 = parseLetters(s);
        Map<Character, Integer> word2 = parseLetters(t);

        return word1.equals(word2);
    }

    private Map<Character, Integer> parseLetters(String s) {
        Map<Character, Integer> count = new HashMap<>();

        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        return count;
    }
}
