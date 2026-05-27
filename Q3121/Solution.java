
import java.util.Arrays;

class Solution {
    public int numberOfSpecialChars(String word) {
        int[] lastCount = new int[26];
        Arrays.fill(lastCount,-1);
        for(int i = 0;i < word.length();i++) {
            char ch = word.charAt(i);
            if(ch >= 'a' && ch <= 'z') {
                lastCount[ch - 'a'] = i;
            }
        }
        int c = 0;
        for(int i = 0 ;i < word.length();i++) {
            char ch = word.charAt(i);
            if(ch >= 'A' && ch <= 'Z') {
                int idx = ch - 'A';
                if(lastCount[idx] >= 0 && lastCount[idx] < i) {
                    c++;
                }
                lastCount[idx] = -2;
            }
        }
        return c;
    }
}