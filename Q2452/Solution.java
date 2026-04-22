import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < queries.length; i++) {
            for (int j = 0; j < dictionary.length; j++) {
                if (edits(queries[i], dictionary[j])) {
                    ans.add(queries[i]);
                    break;
                }
            }
        }
        return ans;
    }

    private static boolean edits(String word1, String word2) {
        int c = 0;
        for (int i = 0; i < word1.length(); i++) {
            if (word1.charAt(i) != word2.charAt(i)) {
                c++;
            }
            if (c > 2)
                return false;
        }
        return true;
    }
}