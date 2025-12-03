/* 
   Problem: 1208
   Source: LeetCode
   Language: Java
*/

package Q1208;

class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int n = s.length();
        int[] cost = new int[n];
        for (int i = 0; i < n; i++) {
            cost[i] = Math.abs(s.charAt(i) - t.charAt(i));
        }
        int maxl = 0;
        int k = 0;
        int sum = 0;
        for (int j = 0; j < n; j++) {
            sum += cost[j];
            while (sum > maxCost) {
                sum -= cost[k];
                k++;
            }
            maxl = Math.max(maxl, j - k + 1);
        }
        return maxl;
    }
}