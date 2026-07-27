class Solution {
    public int getMaximumGold(int[][] grid) {
        int ans = 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for(int i = 0;i < grid.length;i++) {
            for(int j = 0;j < grid[0].length;j++) {
                if(grid[i][j] != 0) {
                    ans = Math.max(ans,solve(i,j,grid,visited));
                }
            }
        }
        return ans;
    }
    int solve(int i,int j,int[][] grid,boolean[][] visited) {
        if(i >= grid.length || j >= grid[0].length || i < 0 || j < 0) {
            return 0;
        }
        if(grid[i][j] == 0) return 0;
        if(visited[i][j]) return 0;
        visited[i][j] = true;
        int up = solve(i-1,j,grid,visited);
        int down = solve(i+1,j,grid,visited);
        int left = solve(i,j-1,grid,visited);
        int right = solve(i,j+1,grid,visited);
        visited[i][j] = false;
        return grid[i][j] + Math.max(up,Math.max(down,Math.max(left,right)));
    }
}