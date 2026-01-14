package Q1492;

import java.util.ArrayList;

class Solution {
    public int kthFactor(int n, int k) {
        ArrayList<Integer> small = new ArrayList<>();
        ArrayList<Integer> large = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                small.add(i);
                if (i != n / i) {
                    large.add(n / i);
                }
            }
        }
        if (k > (small.size() + large.size()))
            return -1;
        if (k > small.size()) {
            k -= small.size();
            return large.get(large.size() - k);
        }
        return small.get(k - 1);
    }
}
