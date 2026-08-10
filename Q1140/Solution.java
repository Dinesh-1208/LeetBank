class Solution {
    int[][] dp;
    public int stoneGameII(int[] piles) {
        int n = piles.length;
        dp = new int[n][n+1];
        return solve(piles, 0, 1);
    }
    private int solve(int[] piles, int index, int M) {
        if (index >= piles.length) {
            return 0;
        }
        if (index + 2 * M >= piles.length) {
            int sum = 0;
            for (int i = index; i < piles.length; i++) {
                sum += piles[i];
            }
            return sum;
        }
        if (dp[index][M] != 0) {
            return dp[index][M];
        }
        int total = 0;
        for (int i = index; i < piles.length; i++) {
            total += piles[i];
        }

        int best = 0;
        for (int X = 1; X <= 2 * M; X++) {
            int opponent = solve(
                piles,
                index + X,
                Math.max(M, X)
            );
            int currentPlayer = total - opponent;
            best = Math.max(best, currentPlayer);
        }
        dp[index][M] = best;
        return best;
    }
}