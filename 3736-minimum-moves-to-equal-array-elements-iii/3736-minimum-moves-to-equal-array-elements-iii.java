class Solution {
    public int minMoves(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int n = nums.length;
        for(int num : nums) {
            sum += num;
            max = Math.max(max,num);
        }
        return Math.abs(sum - (n*max));
    }
}