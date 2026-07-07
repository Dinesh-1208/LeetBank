class Solution {
    public long sumAndMultiply(int n) {
        long[] ans = calcSum(n);
        return ans[0]*ans[1];
    }
    static long[] calcSum(int n) {
        long base = 1;
        long sum = 0;
        long ans = 0;
        while(n > 0) {
            long l = n % 10;
            sum += l;
            if(l != 0) {
                ans += (base * l);
                base *= 10;
            }
            n /= 10;
        }
        return new long[]{sum,ans};
    }
}