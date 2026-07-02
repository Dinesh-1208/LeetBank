import java.util.*;
class Solution {
    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        int m = grid.size();
        int n = grid.get(0).size();
        int startHealth = health - grid.get(0).get(0); 
        if(startHealth <= 0) {
            return false;
        }
        int[][] bestHealth = new int[m][n];
        for(int i = 0;i < m;i++) {
            Arrays.fill(bestHealth[i],-1);
        }
        int[] dr = new int[]{-1,1,0,0};
        int[] dc = new int[]{0,0,-1,1};
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0,0,startHealth});
        bestHealth[0][0] = startHealth;
        while(!q.isEmpty()) {
            int[] curr = q.poll();
            int r = curr[0];
            int c = curr[1];
            int h = curr[2];
            if(h < bestHealth[r][c]) continue;
            if(r == m-1 && c == n-1) return true;
            for(int i = 0;i < 4;i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];
                if(nr >= m || nr < 0 || nc < 0 || nc >= n) continue;
                int nh = h - grid.get(nr).get(nc);
                if(nh <= 0) continue;
                if(nh > bestHealth[nr][nc]) {
                    bestHealth[nr][nc] = nh;
                    q.offer(new int[]{nr,nc,nh});
                }
            }
        }
        return false;
    }
}