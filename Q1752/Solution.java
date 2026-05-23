class Solution {
    public boolean check(int[] nums) {
        int c = 0;
        int n = nums.length - 1;
        for(int i = 0;i < n;i++) {
            if(nums[i] > nums[i+1]) c++;
        }
        if(nums[0] < nums[n]) c++;
        return (c <= 1);
    }
}