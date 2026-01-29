class Solution {
    public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
        final long INF = (long) 1e18;
        int n = 26;
        int m = target.length();
        long[][] adj = new long[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    adj[i][j] = 0;
                } else {
                    adj[i][j] = INF;
                }
            }
        }
        for (int i = 0; i < original.length; i++) {
            int u = original[i] - 'a';
            int v = changed[i] - 'a';
            adj[u][v] = Math.min(cost[i], adj[u][v]);
        }
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (adj[i][k] + adj[k][j] < adj[i][j]) {
                        adj[i][j] = adj[i][k] + adj[k][j];
                    }
                }
            }
        }
        long totalCost = 0;
        for (int i = 0; i < m; i++) {
            char s = source.charAt(i);
            char t = target.charAt(i);
            if (s == t)
                continue;
            int u = s - 'a';
            int v = t - 'a';
            if (adj[u][v] == INF)
                return -1;
            totalCost += adj[u][v];
        }
        return totalCost;
    }
}