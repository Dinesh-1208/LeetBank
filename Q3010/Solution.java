class Solution {
    public int minimumCost(int[] nums) {
        int n1 = 111;
        int n2 = 222;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < n1) {
                n2 = n1;
                n1 = nums[i];
            } else if (nums[i] < n2) {
                n2 = nums[i];
            }
        }
        return nums[0] + n1 + n2;
    }
}