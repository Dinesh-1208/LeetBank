/* 
   Problem: 1759
   Source: LeetCode
   Language: Java
*/
package Q1759;

class Solution {
    public int countHomogenous(String s) {
        long ans = 0;
        long MOD = 1000000007;
        int c = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                c++;
            } else {
                ans = (ans + (long) c * (c + 1) / 2) % MOD;
                c = 1;
            }
        }
        ans = (ans + (long) c * (c + 1) / 2) % MOD;
        return (int) ans;
    }
}