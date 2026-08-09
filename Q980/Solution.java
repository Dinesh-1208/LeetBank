class Solution {
    int ans = 0;
    public int uniquePathsIII(int[][] grid) {
        ans = 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int sR = 0;
        int sC = 0;
        int rem = 0;
        for(int i = 0;i < grid.length;i++) {
            for(int j = 0;j < grid[0].length;j++) {
                if(grid[i][j] != -1) {
                    rem++;
                }
                if(grid[i][j] == 1) {
                    sR = i;
                    sC = j;
                }
            }
        }
        solve(sR,sC,grid,visited,rem);
        return ans;
    }
    void solve(int r,int c,int[][] grid,boolean[][] visited,int rem) {
        if(r < 0 || r >= grid.length || c < 0 || c >= grid[0].length) {
            return;
        }
        if(grid[r][c] == -1 || visited[r][c]) return;
        visited[r][c] = true;
        rem--;
        if(grid[r][c] == 2) {
            if(rem == 0) {
                ans++;
            }
            visited[r][c] = false;
            return;
        }
        if(r < grid.length - 1) {
            solve(r+1,c,grid,visited,rem);
        }
        if(r > 0) {
            solve(r - 1,c,grid,visited,rem);
        }
        if(c > 0) {
            solve(r,c - 1,grid,visited,rem);
        }
        if(c < grid[0].length - 1) {
            solve(r,c+1,grid,visited,rem);
        }
        visited[r][c] = false;
    }
}