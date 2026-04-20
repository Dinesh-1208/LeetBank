class Solution {
    public int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        int n = height.length;
        int l = 0;
        int r = n - 1;
        int leftMax = height[l];
        int rightMax = height[r];
        int ans = 0;
        while (l <= r) {
            if (leftMax <= rightMax) {
                ans += (leftMax - height[l]);
                l++;
                if (l < n)
                    leftMax = Math.max(leftMax, height[l]);
            } else {
                ans += (rightMax - height[r]);
                r--;
                if (r >= 0)
                    rightMax = Math.max(rightMax, height[r]);
            }
        }
        return ans;
    }
}
