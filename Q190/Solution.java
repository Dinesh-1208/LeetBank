class Solution {
    public int reverseBits(int n) {
        int bit;
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            bit = n & 1;
            ans = (ans << 1) | bit;
            n = n >> 1;
        }
        return ans;
    }
}