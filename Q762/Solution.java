package Q762;

import java.util.Set;

class Solution {
    public int countPrimeSetBits(int left, int right) {
        int ans = 0;
        Set<Integer> primes = Set.of(2, 3, 5, 7, 11, 13, 17, 19);
        for (int i = left; i <= right; i++) {
            int bits = count(i);
            if (primes.contains(bits)) {
                ans++;
            }
        }
        return ans;
    }

    private static int count(int n) {
        int c = 0;
        while (n != 0) {
            n = n & (n - 1);
            c++;
        }
        return c;
    }
}