import java.util.*;

class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> ans = new ArrayList<>();
        ans.add(0);
        for (int i = 0; i < n; i++) {
            int l = ans.size();
            for (int j = l - 1; j >= 0; j--) {
                ans.add(ans.get(j) | (1 << i));
            }
        }
        return ans;
    }
}