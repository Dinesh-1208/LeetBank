/* 
   Problem: 2154
   Source: LeetCode
   Language: Java
*/

package Q2147;

class Solution {
    public int numberOfWays(String corridor) {
        long ways = 1;
        long MOD = 1_000_000_007L;
        int s = 0;
        for (int i = 0; i < corridor.length(); i++) {
            if (corridor.charAt(i) == 'S') {
                s++;
            }
        }
        if (s == 0 || s % 2 != 0)
            return 0;
        if (s == 2)
            return 1;
        int c = 0;
        int lastIndex = 0;
        for (int i = 0; i < corridor.length(); i++) {
            if (c < 2 && corridor.charAt(i) == 'S') {
                c++;
            } else if (corridor.charAt(i) == 'P') {
                continue;
            } else {
                c = 1;
                ways = (ways * (i - lastIndex)) % MOD;
            }
            if (c == 2) {
                lastIndex = i;
            }
        }
        return (int) ways;
    }
}