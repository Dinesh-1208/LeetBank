/* 
   Problem: 2435
   Source: LeetCode
   Language: Java
*/

class Solution {
    public int numberOfPaths(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        long MOD = 1000000007L;
        long[][][] dp = new long[m][n][k];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    dp[0][0][grid[0][0] % k] = 1;
                    continue;
                }
                for (int r = 0; r < k; r++) {
                    int val = grid[i][j] % k;
                    int newr = (val + r) % k;
                    if (i > 0) {
                        dp[i][j][newr] += dp[i - 1][j][r];
                        dp[i][j][newr] %= MOD;
                    }
                    if (j > 0) {
                        dp[i][j][newr] += dp[i][j - 1][r];
                        dp[i][j][newr] %= MOD;
                    }
                }
            }
        }
        return (int) dp[m - 1][n - 1][0];
    }
}