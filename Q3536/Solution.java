class Solution {
    public int maxProduct(int n) {
        int first = 0;
        int second = 0;
        while(n > 0) {
            int l = n % 10;
            if(l > first) {
                second = first;
                first = l;
            } else if(second < l) {
                second = l;
            }
            n /= 10;
        }
        return first*second;
    }
}