
import java.util.HashMap;
import java.util.Map;

class Solution {
    public String minWindow(String s, String t) {
        if(t.isEmpty()) return "";
        Map<Character,Integer> tc = new HashMap<>();
        Map<Character,Integer> wd = new HashMap<>();

        for(char c : t.toCharArray()) {
            tc.put(c,tc.getOrDefault(c,0) + 1);
        }
        int have = 0;
        int need = tc.size();
        int[] ans = new int[]{-1,-1};
        int l = 0;
        int minLen = Integer.MAX_VALUE;
        for(int r = 0;r < s.length();r++) {
            char c = s.charAt(r);
            wd.put(c,wd.getOrDefault(c,0) + 1);
            if(tc.containsKey(c) && (wd.get(c).equals(tc.get(c)))) {
                have++;
            } 
            while(have == need) {
                if(r-l+1 < minLen) {
                    minLen = r - l + 1;
                    ans[0] = l;
                    ans[1] = r;
                }

                char lc = s.charAt(l);
                wd.put(lc,wd.get(lc) - 1);
                if(tc.containsKey(lc) && (wd.get(lc) < tc.get(lc))) have--;
                l++;
            }
        }
        return minLen == Integer.MAX_VALUE? "" : s.substring(ans[0],ans[1]+1);
     }
}