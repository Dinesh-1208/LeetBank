package Q1871;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {
        int n = s.length();
        Queue<Integer> q = new LinkedList<>();
        q.offer(0);
        boolean[] visited = new boolean[n];
        visited[0] = true;
        int far_checked = 0;
        while (!q.isEmpty()) {
            int i = q.poll();
            int start = minJump + i;
            int end = Math.min(maxJump + i, n - 1);
            start = Math.max(start, far_checked);
            for (int j = start; j <= end; j++) {
                if (s.charAt(j) == '0' && !visited[j]) {
                    if (j == n - 1)
                        return true;
                    visited[j] = true;
                    q.offer(j);
                }
            }
            far_checked = end + 1;
        }
        return false;
    }
}
