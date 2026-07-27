class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return solve(0,0,nums,target);
    }
    static int solve(int index,int sum,int[] nums,int target) {
        if(index == nums.length) {
            if(sum == target) {
                return 1;
            }
            return 0;
        }
        int pick = solve(index+1,sum+nums[index],nums,target);
        int np = solve(index+1,sum - nums[index],nums,target);
        return pick + np;
    }
}