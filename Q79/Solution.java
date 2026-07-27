class Solution {
    public boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (solve(0, i, j, board, visited, word)) {
                    return true;
                }
            }
        }
        return false;
    }
    static boolean solve(int index,int i,int j,char[][] board,boolean[][] visited,String word) {
        if(index == word.length()) {
            return true;
        }
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length) {
            return false;
        }
        if(word.charAt(index) != board[i][j]) return false;
        if(visited[i][j]) return false;
        visited[i][j] = true;
        boolean down = solve(index+1,i+1,j,board,visited,word);
        boolean right = solve(index+1,i,j+1,board,visited,word);
        boolean up = solve(index+1,i-1,j,board,visited,word);
        boolean left = solve(index+1,i,j-1,board,visited,word);
        visited[i][j] = false;
        return up || down || right || left;
    }
}