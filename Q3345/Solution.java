class Solution {
    public int smallestNumber(int n, int t) {
        while(n <= 100) {
            int p = product(n);
            if(p % t == 0) {
                break;
            }
            n++;
        }
        return n;
    }
    static int product(int n) {
        int ans = 1;
        while(n != 0) {
            int d = n % 10;
            ans *= d;
            n /= 10;
        }
        return ans;
    }
}