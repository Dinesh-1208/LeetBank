class Solution {
    public int numOfWays(int n) {
        long mod = 1_000_000_007;
        long abc = 6;
        long aba = 6;
        for(int i = 2;i <=n;i++) {
            long currabc = ((2 * abc) + (2 * aba)) % mod;
            long curraba = ((2 * abc) + (3 * aba)) % mod;
            abc = currabc;
            aba = curraba;
        }
        return (int)((abc + aba) % mod);
    }
}