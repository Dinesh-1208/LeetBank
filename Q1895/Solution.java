class Solution {
    public int largestMagicSquare(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int k = Math.min(m, n);
        int[][] rowPs = new int[m][n];
        for (int i = 0; i < m; i++) {
            rowPs[i][0] = grid[i][0];
            for (int j = 1; j < n; j++) {
                rowPs[i][j] = rowPs[i][j - 1] + grid[i][j];
            }
        }
        int[][] colPs = new int[n][m];
        for (int i = 0; i < n; i++) {
            colPs[i][0] = grid[0][i];
            for (int j = 1; j < m; j++) {
                colPs[i][j] = colPs[i][j - 1] + grid[j][i];
            }
        }
        for (int i = k; i >= 2; i--) {
            for (int j = 0; j + i <= m; j++) {
                for (int l = 0; l + i <= n; l++) {
                    if (isMagic(i, grid, rowPs, colPs, j, l)) {
                        return i;
                    }
                }
            }
        }
        return 1;
    }

    private static boolean isMagic(int k, int[][] grid, int[][] rowPs, int[][] colPs, int r, int c) {
        int target = (c == 0) ? rowPs[r][c + k - 1] : rowPs[r][c + k - 1] - rowPs[r][c - 1];
        for (int i = 0; i < k; i++) {
            int sum = (c == 0) ? rowPs[r + i][c + k - 1] : rowPs[r + i][c + k - 1] - rowPs[r + i][c - 1];
            if (sum != target)
                return false;
        }
        for (int j = 0; j < k; j++) {
            int sum = (r == 0) ? colPs[c + j][r + k - 1] : colPs[c + j][r + k - 1] - colPs[c + j][r - 1];
            if (sum != target)
                return false;
        }
        int d1 = 0;
        for (int i = 0; i < k; i++) {
            d1 += grid[r + i][c + i];
        }
        if (d1 != target)
            return false;
        int d2 = 0;
        for (int i = 0; i < k; i++) {
            d2 += grid[r + i][c + k - 1 - i];
        }
        if (d2 != target)
            return false;
        return true;
    }
}