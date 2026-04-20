package Q2078;

class Solution {
    public int maxDistance(int[] colors) {
        int l = 0;
        int r = colors.length - 1;
        int ans = 0;
        while (l < r) {
            if (colors[l] != colors[r]) {
                ans = Math.max(ans, Math.abs(r - l));
                break;
            }
            r--;
        }
        l = 0;
        r = colors.length - 1;
        while (l < r) {
            if (colors[l] != colors[r]) {
                ans = Math.max(ans, Math.abs(r - l));
                break;
            }
            l++;
        }
        return ans;
    }
}
