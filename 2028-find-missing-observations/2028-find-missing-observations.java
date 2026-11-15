class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int m = rolls.length;
        int totalLen = m + n;
        int total = mean*totalLen;
        int sum = 0;
        for(int x : rolls) {
            sum += x;
        }
        int rem = total - sum;
        if(rem < n || rem > 6*n) return new int[0];
        int[] ans = new int[n];
        for(int i = 1;i <= n;i++) {
            int slots = n - i;
            int v = Math.max(1,rem - 6*slots);
            ans[i - 1] = v;
            rem -= v;
        }
        return ans;
    }
}