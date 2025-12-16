/* 
   Problem: 1486
   Source: LeetCode
   Language: Java
*/

class Solution {
    public int xorOperation(int n, int start) {
        int ans = start;
        for (int i = 1; i < n; i++) {
            int res = 2 * i + start;
            ans ^= res;
        }
        return ans;
    }
}
