package Q728;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isselfDivide(i)) {
                ans.add(i);
            }
        }
        return ans;
    }

    static boolean isselfDivide(int n) {
        int temp = n;
        while (temp != 0) {
            int digit = temp % 10;
            if (digit == 0)
                return false;
            if ((n % digit) != 0)
                return false;
            temp /= 10;
        }
        return true;
    }
}