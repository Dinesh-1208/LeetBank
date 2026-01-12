class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m+1][n+1];
        int ans = solve(0,0,m,n,dp);
        return ans;
    }
    private static int solve(int i,int j,int m,int n,int[][] dp) {
        if(i == m-1 && j == n-1) return 1;
        if(i >= m || j >= n) return 0;
        if(dp[i][j] != 0) return dp[i][j];
        dp[i][j] = solve(i+1,j,m,n,dp) + solve(i,j+1,m,n,dp);
        return dp[i][j];
    }
}