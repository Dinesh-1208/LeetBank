/* 
   Problem: 3432
   Source: LeetCode
   Language: Java
*/

class Solution {
    public int countPartitions(int[] nums) {
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        if (sum % 2 != 0) {
            return 0;
        }
        return nums.length - 1;
    }
}