class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int n = nums1.length - 1;
        int m = nums2.length - 1;
        int ans = 0;
        int i = 0;
        int j = 0;
        while(i <= n && j <= m) {
            if(i <= j && nums1[i] <= nums2[j]) {
                ans = Math.max(ans,j-i);
                j++;
            } else {
                i++;
                j = i;
            }
        }
        return ans;
    }
}