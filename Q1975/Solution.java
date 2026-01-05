
class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        long mini = Long.MAX_VALUE;
        long sum = 0;
        int c = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                long val = matrix[i][j];
                if (val < 0)
                    c++;
                long num = Math.abs(val);
                sum += num;
                mini = Math.min(mini, num);
            }
        }
        if ((c & 1) == 1)
            return sum - 2 * mini;
        return sum;
    }
}