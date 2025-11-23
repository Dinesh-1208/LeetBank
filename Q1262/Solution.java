
/* 
   Problem: 1262
   Source: LeetCode
   Language: Java
*/

class Solution {
    public int maxSumDivThree(int[] nums) {
        int ans = 0;
        int r1a = Integer.MAX_VALUE, r1b = Integer.MAX_VALUE;
        int r2a = Integer.MAX_VALUE, r2b = Integer.MAX_VALUE;
        for (int n : nums) {
            ans += n;
            if (n % 3 == 1) {
                if (n < r1a) {
                    r1b = r1a;
                    r1a = n;
                } else if (n < r1b) {
                    r1b = n;
                }
            } else if (n % 3 == 2) {
                if (n < r2a) {
                    r2b = r2a;
                    r2a = n;
                } else if (n < r2b) {
                    r2b = n;
                }
            }
        }
        int mod = ans % 3;
        if (mod == 0)
            return ans;
        int remove = Integer.MAX_VALUE;
        if (mod == 1) {
            remove = r1a;
            if (r2b != Integer.MAX_VALUE) {
                remove = Math.min(remove, r2a + r2b);
            }
        } else {
            remove = r2a;
            if (r1b != Integer.MAX_VALUE) {
                remove = Math.min(remove, r1a + r1b);
            }
        }
        return ans - remove;
    }
}