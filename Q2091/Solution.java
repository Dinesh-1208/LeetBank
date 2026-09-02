    class Solution {
        public int minimumDeletions(int[] nums) {
            int n = nums.length;
            int mini = 0;
            int maxi = 0;
            for(int i = 1;i < n;i++) {
                if(nums[i] < nums[mini]) {
                    mini = i;
                } 
                if(nums[i] > nums[maxi]) {
                    maxi = i;
                }
            }
            int l = Math.min(mini, maxi);
            int r = Math.max(mini, maxi); 
            return Math.min(Math.min(r + 1, n - l), l + 1 + n - r);
        }
    }