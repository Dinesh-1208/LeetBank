import java.util.HashMap;
import java.util.Map;

class Solution {
    public int minMirrorPairDistance(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        int n = nums.length;
        int ans = n;
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            if (mp.containsKey(num)) {
                ans = Math.min(ans, i - mp.get(num));
            }
            mp.put(reverseNum(num, 0), i);
        }
        return (ans == n) ? -1 : ans;
    }

    private static int reverseNum(int x, int sum) {
        if (x == 0)
            return sum;
        sum = sum * 10 + (x % 10);
        return reverseNum(x / 10, sum);
    }
}