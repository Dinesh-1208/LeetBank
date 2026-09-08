class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int l = Integer.MIN_VALUE;
        int h = Integer.MAX_VALUE;
        int[] maxi = new int[n];
        int[] mini = new int[n];
        for(int i = 0;i < n;i++) {
            if(l < nums[i]) {
                l = nums[i];
            }
            maxi[i] = l;
        }
        for(int i = n-1;i >= 0;i--) {
            if(h > nums[i]) {
                h = nums[i];
            }
            mini[i] = h;
        }
        int ans = -1;
        for(int i = 0;i < n;i++) {
            if(maxi[i] - mini[i] <= k) {
                ans = i;
                break;
            }
        }
        return ans;
    }
}