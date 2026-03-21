package Q3643;

public class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int s = x;
        int l = x + k - 1;
        while (s < l) {
            for (int j = y; j < y + k; j++) {
                int temp = grid[l][j];
                grid[l][j] = grid[s][j];
                grid[s][j] = temp;
            }
            s++;
            l--;
        }
        return grid;
    }
}