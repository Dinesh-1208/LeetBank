
import java.util.Arrays;

class Solution {

    int[] dp;
    Boolean[][] pal;

    public int maxPalindromes(String s, int k) {

        int n = s.length();

        dp = new int[n];
        Arrays.fill(dp, -1);

        pal = new Boolean[n][n];

        return solve(s, 0, k);
    }

    int solve(String s, int i, int k) {

        if (i == s.length()) {
            return 0;
        }

        if (dp[i] != -1) {
            return dp[i];
        }

        int opt1 = solve(s, i + 1, k);
        int opt2 = 0;

        for (int j = i; j < s.length(); j++) {

            if ((j - i + 1) >= k &&
                isPalindrome(s, i, j)) {

                opt2 = Math.max(
                    opt2,
                    1 + solve(s, j + 1, k)
                );
            }
        }

        dp[i] = Math.max(opt1, opt2);

        return dp[i];
    }

    boolean isPalindrome(String s, int i, int j) {

        if (i >= j) {
            return true;
        }

        if (pal[i][j] != null) {
            return pal[i][j];
        }

        if (s.charAt(i) != s.charAt(j)) {
            pal[i][j] = false;
            return false;
        }

        pal[i][j] = isPalindrome(s, i + 1, j - 1);

        return pal[i][j];
    }
}
