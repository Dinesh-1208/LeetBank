import java.util.*;

class Solution {

    public List<List<String>> solveNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        List<List<String>> ans = new ArrayList<>();
        queens(board, 0, ans);
        return ans;
    }

    static void queens(boolean[][] board, int row, List<List<String>> ans) {

        if (row == board.length) {
            ans.add(display(board));
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                queens(board, row + 1, ans);
                board[row][col] = false;
            }
        }
    }

    static boolean isSafe(boolean[][] board, int row, int col) {

        // vertical
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }

        // diagonal left
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if (board[row - i][col - i]) {
                return false;
            }
        }

        // diagonal right
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if (board[row - i][col + i]) {
                return false;
            }
        }

        return true;
    }

    static List<String> display(boolean[][] board) {

        List<String> temp = new ArrayList<>();

        for (boolean[] arr : board) {
            StringBuilder sb = new StringBuilder();

            for (boolean el : arr) {
                if (el) {
                    sb.append("Q");
                } else {
                    sb.append(".");
                }
            }

            temp.add(sb.toString());
        }

        return temp;
    }
}