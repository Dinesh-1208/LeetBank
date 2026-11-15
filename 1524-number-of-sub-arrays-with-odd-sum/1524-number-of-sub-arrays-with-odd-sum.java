class Solution {
    public int numOfSubarrays(int[] arr) {
        int mod = 1000000007;
        int ans = 0;
        int ec = 1;
        int oc = 0;
        int sum = 0;
        for(int x : arr) {
            sum += x;
            if((sum & 1) == 0) {
                ans = (ans + oc) % mod;
                ec++;
            } else {
                ans = (ans + ec) % mod;
                oc++;
            }
        }
        return (int)ans;
    }
}