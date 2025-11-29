/* 
   Problem: 3512
   Source: LeetCode
   Language: Java
*/

package Q3512;

class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        return sum % k;
    }
}