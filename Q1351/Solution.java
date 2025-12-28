class Solution {
    public int countNegatives(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length - 1;
        int count = 0;
        int row = 0;
        while (row < rows && cols >= 0) {
            if (grid[row][cols] >= 0) {
                row++;
            } else {
                count += rows - row;
                cols--;
            }
        }
        return count;
    }
}