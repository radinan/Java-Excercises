import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> valueIndex = new HashMap<>();

        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            valueIndex.put(c, valueIndex.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); ++i) {
            if (valueIndex.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
