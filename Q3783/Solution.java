class Solution {
    public int mirrorDistance(int n) {
        return Math.abs(n - reverse(n));
    }

    private static int reverse(int n) {
        int sum = 0;
        while (n > 0) {
            sum = sum * 10 + (n % 10);
            n /= 10;
        }
        return sum;
    }
}