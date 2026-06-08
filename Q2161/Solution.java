class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int less = 0;
        int equal = 0;
        for(int x : nums) {
            if(x < pivot) less++;
            else if(x == pivot) equal++;
        }
        int[] ans = new int[nums.length];
        int less1 = 0;
        int eq1 = less;
        int g = less + equal;
        for(int x : nums) {
            if(x < pivot) {
                ans[less1] = x;
                less1++;
            } else if(x > pivot) {
                ans[g] = x;
                g++;
            } else {
                ans[eq1] = x;
                eq1++;
            }
        }
        return ans;
    }
}