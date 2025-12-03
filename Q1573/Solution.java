/* 
   Problem: 1573
   Source: LeetCode
   Language: Java
*/
package Q1573;

class Solution {
    public int numWays(String s) {
        int count = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                count++;
            }
        }
        if (count % 3 != 0) {
            return 0;
        }
        if (count == 0) {
            long ways = ((long) (n - 1) * (n - 2)) / 2;
            return (int) (ways % 1000000007);
        }
        int k = count / 3;
        int c = 0;
        int first1 = -1, last1 = -1;
        int first2 = -1, last2 = -1;
        int first3 = -1, last3 = -1;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                c++;
                if (c == 1)
                    first1 = i;
                if (c == k)
                    last1 = i;

                if (c == k + 1)
                    first2 = i;
                if (c == 2 * k)
                    last2 = i;

                if (c == 2 * k + 1)
                    first3 = i;
                if (c == 3 * k)
                    last3 = i;
            }
        }
        long ways1 = first2 - last1;
        long ways2 = first3 - last2;
        long mod = 1000000007;
        long ans = (ways1 * ways2) % mod;
        return (int) ans;
    }
}