
import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character,Integer> mp = new HashMap<>();
        for(char c : s1.toCharArray()) {
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        int l = 0;
        for(int r = 0;r < s2.length();r++) {
            if(mp.containsKey(s2.charAt(r))) {
                mp.put(s2.charAt(r),mp.get(s2.charAt(r)) - 1);
                while(mp.get(s2.charAt(r)) < 0) {
                    mp.put(s2.charAt(l),mp.get(s2.charAt(l)) + 1);
                    l++;
                }
                if(r - l + 1 == s1.length()) return true;
            } else {
                while(l <= r) {
                    if(mp.containsKey(s2.charAt(l))) {
                        mp.put(s2.charAt(l),mp.get(s2.charAt(l)) + 1);
                    }
                    l++;
                }
            }
        }
        return false;
    }
}
