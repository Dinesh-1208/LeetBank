package Power_Set_BackTracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// User function Template for Java

class Solution {
    public List<String> AllPossibleStrings(String s) {
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        backtrack(s, 0, sb, ans);
        Collections.sort(ans);
        return ans;
    }

    private static void backtrack(String s, int start, StringBuilder sb, List<String> ans) {
        if (sb.length() > 0) {
            ans.add(sb.toString());
        }
        for (int i = start; i < s.length(); i++) {
            sb.append(s.charAt(i));
            backtrack(s, i + 1, sb, ans);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
