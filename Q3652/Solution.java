/* 
   Problem: 3652
   Source: LeetCode
   Language: Java
*/

class Solution {
    public long maxProfit(int[] prices, int[] strategy, int k) {
        int n = prices.length;
        long[] priceSum = new long[n];
        long[] profitSum = new long[n];
        priceSum[0] = prices[0];
        profitSum[0] = prices[0]*strategy[0];
        long base = prices[0]*strategy[0];
        for(int i = 1;i < n;i++) {
            priceSum[i] = priceSum[i-1] + prices[i];
            profitSum[i] = profitSum[i-1] + prices[i]*strategy[i];
            base += prices[i]*strategy[i];
        }
        long ans = base;
        for(int j = 0;j <= n-k;j++) {
            long old = profitSum[j+k-1] - (j > 0 ? profitSum[j-1] : 0);
            long newOne = priceSum[j+k-1] - priceSum[j+(k/2)-1];
            ans = Math.max(ans,base + (newOne -old));
        }
        return ans;
    }
}