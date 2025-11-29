
/* 
   Problem: 485
   Source: LeetCode
   Language: Java
*/

package Q485;

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0;
        int maxi = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                ans++;
            } else {
                maxi = Math.max(maxi, ans);
                ans = 0;
            }
        }
        maxi = Math.max(maxi, ans);
        return maxi;
    }
}
