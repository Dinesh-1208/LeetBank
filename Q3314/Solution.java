package Q3314;

import java.util.List;

class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int l = nums.size();
        int[] ans = new int[l];
        for (int i = 0; i < l; i++) {
            int num = nums.get(i);
            int n = findValue(num);
            ans[i] = n;
        }
        return ans;
    }

    private static int findValue(int target) {
        for (int x = 1; x < target; x++) {
            if ((x | (x + 1)) == target) {
                return x;
            }
        }
        return -1;
    }
}