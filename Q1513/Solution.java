/* 
   Problem: 1513
   Source: LeetCode
   Language: Java
*/

package Q1513;

class Solution {
    public int numSub(String s) {
        long ans = 0;
        long c1 = 0;
        int mod = 1_000_000_007;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                c1++;
            } else {
                ans = (ans + (c1 * (c1 + 1) / 2)) % mod;
                c1 = 0;
            }
        }
        ans = (ans + (c1 * (c1 + 1) / 2)) % mod;
        return (int) ans;
    }
}
