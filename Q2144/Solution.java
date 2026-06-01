
import java.util.Arrays;

class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int ans = 0;
        int n = cost.length;
        for(int i = cost.length - 1;i >=0;i--) {
            if((n - i - 1) % 3 != 2) {
                ans += cost[i];
            }
        }
        return ans;
    }
}