package Q1925;

class Solution {
    public int countTriples(int n) {
        int c = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int c1 = i * i + j * j;
                if (c1 <= n * n && isPs(c1)) {
                    c++;
                }
            }
        }
        return c;
    }

    public static boolean isPs(int x) {
        int s = 1;
        int e = x;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            long sq = (long) mid * mid;
            if (sq == x)
                return true;
            if (sq > x) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return false;
    }
}