class Solution {
    public void solveSudoku(char[][] board) {
        int[][] nums = new int[9][9];
        // Convert char[][] to int[][]
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                if(board[i][j] == '.') {
                    nums[i][j] = 0;
                } else {
                    nums[i][j] = board[i][j] - '0';
                }
            }
        }
        solve(nums);
        // Convert int[][] back to char[][]
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                board[i][j] = (char)(nums[i][j] + '0');
            }
        }
    }
    static boolean solve(int[][] board) {
        int n = board.length;
        int row = -1;
        int col = -1;
        boolean emptyLeft = true;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(board[i][j] == 0) {
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }
            if(!emptyLeft) {
                break;
            }
        }
        if(emptyLeft) {
            // sudoku solved
            return true;
        }
        // backtrack
        for(int num = 1; num <= 9; num++) {

            if(isSAfe(board, row, col, num)) {

                board[row][col] = num;

                if(solve(board)) {
                    // found answer
                    return true;
                } else {
                    // backtrack
                    board[row][col] = 0;
                }
            }
        }
        return false;
    }

    static boolean isSAfe(int[][] board, int row, int col, int num) {
        // check the row
        for(int i = 0; i < board.length; i++) {
            if(board[row][i] == num) {
                return false;
            }
        }
        // check the column
        for(int j = 0; j < board.length; j++) {
            if(board[j][col] == num) {
                return false;
            }
        }
        // check the box
        int sqrt = (int)(Math.sqrt(board.length));
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;
        for(int r = rowStart; r < rowStart + sqrt; r++) {
            for(int c = colStart; c < colStart + sqrt; c++) {
                if(board[r][c] == num) {
                    return false;
                }
            }
        }
        return true;
    }
}