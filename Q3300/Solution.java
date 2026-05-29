class Solution {
    public int minElement(int[] nums) {
        int mini = Integer.MAX_VALUE;
        for(int x : nums) {
            mini = Math.min(mini,digitSum(x));
        }
        return mini;
    }
    static int digitSum(int n) {
        int sum = 0;
        while(n > 0) {
            sum += (n % 10);
            n /= 10;
        }
        return sum;
    }
}