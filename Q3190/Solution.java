/* 
   Problem: 3190
   Source: LeetCode
   Language: Java
*/

package Q3190;

class Solution {
    public int minimumOperations(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans += Math.min(nums[i] % 3, 3 - (nums[i] % 3));
        }
        return ans;
    }
}