class Solution {
    public int numSquares(int n) {
        if (isPerfectSquare(n))
            return 1;
        for (int i = 1; i * i <= n; i++) {
            int r = n - i * i;
            if (isPerfectSquare(r))
                return 2;
        }
        while (n % 4 == 0) {
            n /= 4;
        }
        if (n % 8 == 7)
            return 4;
        else
            return 3;
    }

    private boolean isPerfectSquare(int n) {
        int r = (int) (Math.sqrt(n));
        return r * r == n;
    }
}
