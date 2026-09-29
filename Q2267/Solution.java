class Solution {
    public boolean hasValidPath(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        Boolean[][][] dp = new Boolean[m][n][m + n];

        return solve(grid, 0, 0, 0, m, n, dp);
    }
    private boolean solve(char[][] grid,int i,int j,int depth,int m,int n,Boolean[][][] dp) {
        if(grid[i][j] == '(') {
            depth++;
        } else {
            depth--;
        }
        if(depth < 0) return false;
        if(i == m-1 && j == n-1) {
            return depth == 0;
        }
        if(dp[i][j][depth] != null) {
            return dp[i][j][depth];
        }
        boolean result = false;
        if(i + 1 < m) {
            if(solve(grid,i+1,j,depth,m,n,dp)) {
                result = true;
            }
        }
        if(j+1 < n) {
            if(solve(grid,i,j+1,depth,m,n,dp)) {
                result =  true;
            }
        }
        dp[i][j][depth] = result;
        return result;
    }
}