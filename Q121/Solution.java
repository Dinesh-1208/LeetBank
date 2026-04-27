package Q121;

class Solution {
    public int maxProfit(int[] prices) {
        int maxPr = 0;
        int minPrice = prices[0];
        for (int price : prices) {
            maxPr = Math.max(maxPr, price - minPrice);
            minPrice = Math.min(minPrice, price);
        }
        return maxPr;
    }
}
