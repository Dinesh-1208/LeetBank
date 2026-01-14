package Q1828;

class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int m = queries.length;
        int n = points.length;
        int[] ans = new int[m];
        for (int i = 0; i < m; i++) {
            int x1 = queries[i][0];
            int y1 = queries[i][1];
            int r = queries[i][2];
            int r2 = r * r;
            int c = 0;
            for (int j = 0; j < n; j++) {
                int dx = points[j][0] - x1;
                int dy = points[j][1] - y1;
                if (dx * dx + dy * dy <= r2) {
                    c++;
                }
            }
            ans[i] = c;
        }
        return ans;
    }
}
