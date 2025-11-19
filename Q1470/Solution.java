/* 
   Problem: 1470
   Source: LeetCode
   Language: Java
*/

package Q1470;

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int j = 0;
        int k = n;
        for (int i = 0; i < 2 * n; i++) {
            if (i % 2 == 0) {
                ans[i] = nums[j++];
            } else {
                ans[i] = nums[k++];
            }
        }
        return ans;
    }
}
