
import java.util.*;

class Solution {
    public List<String> commonChars(String[] words) {
        List<String> ans = new ArrayList<>();

        for (char ch = 'a'; ch <= 'z'; ch++) {
            int min = Integer.MAX_VALUE;

            for (String word : words) {
                int count = 0;

                for (char c : word.toCharArray()) {
                    if (c == ch) {
                        count++;
                    }
                }

                min = Math.min(min, count);
            }

            for (int i = 0; i < min; i++) {
                ans.add(String.valueOf(ch));
            }
        }

        return ans;
    }
}
