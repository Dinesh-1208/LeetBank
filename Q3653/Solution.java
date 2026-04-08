package Q3653;

class Solution {
    private static final int MOD = 1_000_000_007;

    public int xorAfterQueries(int[] nums, int[][] queries) {
        int ans = 0;
        for (int[] query : queries) {
            int idx = query[0];
            while (idx <= query[1]) {
                nums[idx] = (int) (((long) nums[idx] * query[3]) % MOD);
                idx += (query[2]);
            }
        }
        for (int num : nums) {
            ans ^= num;
        }
        return ans;
    }
}