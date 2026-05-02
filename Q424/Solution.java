import java.util.HashMap;
import java.util.Map;

class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> mp = new HashMap<>();
        int maxf = 0;
        int l = 0;
        int ans = 0;
        for (int r = 0; r < s.length(); r++) {
            mp.put(s.charAt(r), mp.getOrDefault(s.charAt(r), 0) + 1);
            maxf = Math.max(maxf, mp.get(s.charAt(r)));
            while ((r - l + 1) - maxf > k) {
                mp.put(s.charAt(l), mp.get(s.charAt(l)) - 1);
                l++;
            }
            ans = Math.max(ans, r - l + 1);
        }
        return ans;
    }
}
