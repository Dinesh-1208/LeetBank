class Solution {
    public int maxArea(int[] heights) {
        int area = Integer.MIN_VALUE;
        int l = 0;
        int r = heights.length - 1;
        while (l < r) {
            area = Math.max(area, (Math.min(heights[l], heights[r]) * (r - l)));
            if (heights[l] >= heights[r]) {
                r--;
            } else {
                l++;
            }
        }
        return area;
    }
}
