class Solution {
    public boolean isGood(int[] nums) {
        int n = nums.length;
        int[] freq = new int[n+1];
        for(int a : nums) {
            if(a > n - 1) return false;
            if(a < n- 1 && freq[a] > 0) return false;
            if(a == n - 1 && freq[a] > 1) return false;
            freq[a]++;
        }
        return true;
    }
}