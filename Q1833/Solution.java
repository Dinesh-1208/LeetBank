class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int[] freq = new int[100001];
        for(int c : costs) {
            freq[c]++;
        }
        int ans = 0;
        for(int i = 1; i <= 100000;i++) {
            if(freq[i] == 0) continue;
            int canBuy = Math.min(freq[i],coins/i);
            ans += canBuy;
            coins -= canBuy*i;
            if(coins < i) break;
        }
        return ans;
    }
}