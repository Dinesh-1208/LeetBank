class Solution {
    public int majorityElement(int[] nums) {
        int canditate = nums[0];
        int c = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == canditate) {
                c++;
            } else {
                c--;
            }
            if (c == 0) {
                canditate = nums[i];
                c = 1;
            }
        }
        return canditate;
    }
}