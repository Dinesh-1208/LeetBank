
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> hs = new HashSet<>();
        for (char c : word.toCharArray()) {
            hs.add(c);
        }
        int ans = 0;
        for(char c = 'a';c <= 'z';c++) {
            if(hs.contains(c) && hs.contains((char)(c - 'a' + 'A'))) {
                ans++;
            }
        }
        return ans;
    }
}