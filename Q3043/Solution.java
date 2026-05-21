
import java.util.HashSet;

class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<Integer> hs = new HashSet<>();
        int ans = 0;
        for(int x : arr1) {
            while(x > 0) {
                hs.add(x);
                x /= 10;
            }
        }
        for(int x : arr2) {
            while(x > 0 && !hs.contains(x)) {
                x /= 10;
            }
            if(x > 0) {
                ans = Math.max(ans,(int)Math.log10(x)+1);
            }
        }
        return ans;
    }
}