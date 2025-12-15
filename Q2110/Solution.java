/* 
   Problem: 2110
   Source: LeetCode
   Language: Java
*/
package Q2110;

class Solution {
    public long getDescentPeriods(int[] prices) {
        long ans = 1;
        long t = 1;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] + 1 == prices[i - 1]) {
                t++;
            } else {
                t = 1;
            }
            ans += t;
        }
        return ans;
    }
}
