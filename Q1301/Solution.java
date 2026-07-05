import java.util.*;
class Solution {
    List<String> board;
    int[][] score;
    int[][] ways;
    int MOD = 1000000007;
    boolean[][] visited;
    public int[] pathsWithMaxScore(List<String> board) {
        this.board = board;
        int n = board.size();
        score = new int[n][n];
        ways = new int[n][n];
        visited = new boolean[n][n];
        solve(n-1,n-1);
        return new int[]{score[n-1][n-1],ways[n-1][n-1]};
    }
    private void solve(int i,int j) {
        if(i < 0 || j < 0) return;
        if(board.get(i).charAt(j) == 'X') return;
        if(visited[i][j]) return;
        visited[i][j] = true;
        if(i == 0 && j == 0) {
            score[0][0] = 0;
            ways[0][0] = 1;
            return;
        }
        solve(i-1,j);
        solve(i,j - 1);
        solve(i-1,j-1);
        int best = -1;
        int cnt = 0;
        if(i > 0 && ways[i-1][j] > 0) {
            if(score[i-1][j] > best) {
                best = score[i-1][j];
                cnt = ways[i-1][j];
            }else if(score[i-1][j] == best) {
                cnt = (cnt + ways[i-1][j]) % MOD;
            }
        }
        if (j > 0 && ways[i][j - 1] > 0) {
            if (score[i][j - 1] > best) {
                best = score[i][j - 1];
                cnt = ways[i][j - 1];
            } else if (score[i][j - 1] == best) {
                cnt = (cnt + ways[i][j - 1]) % MOD;
            }
        }
        if (i > 0 && j > 0 && ways[i - 1][j - 1] > 0) {
            if (score[i - 1][j - 1] > best) {
                best = score[i - 1][j - 1];
                cnt = ways[i - 1][j - 1];
            } else if (score[i - 1][j - 1] == best) {
                cnt = (cnt + ways[i - 1][j - 1]) % MOD;
            }
        }
        if(best == -1) {
            ways[i][j] = 0;
            score[i][j] = 0;
            return;
        }
        char ch = board.get(i).charAt(j);
        if(ch != 'E' && ch != 'S') {
            best += ch - '0';
        }
        score[i][j] = best;
        ways[i][j] = cnt;
    }
}