package Q1930;

import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public int countPalindromicSubsequence(String s) {
        int[] start = new int[26];
        int[] end = new int[26];
        Arrays.fill(start, -1);
        for (int i = 0; i < s.length(); i++) {
            int cur = s.charAt(i) - 'a';
            if (start[cur] == -1) {
                start[cur] = i;
            }
            end[cur] = i;
        }
        int ans = 0;
        for (int i = 0; i < 26; i++) {
            if (start[i] == -1) {
                continue;
            }
            HashSet<Character> list = new HashSet<>();
            for (int j = start[i] + 1; j < end[i]; j++) {
                list.add(s.charAt(j));
            }
            ans += list.size();
        }
        return ans;
    }
}
