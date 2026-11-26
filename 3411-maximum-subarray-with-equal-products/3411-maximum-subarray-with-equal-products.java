class Solution {
    public int maxLength(int[] nums) {
        int ans = 0;
        for(int i = 0;i < nums.length;i++) {
            long lcm = 1;
            long product = 1;
            long gc = 0;
            for(int j = i;j < nums.length;j++) {
                int x = nums[j];
                product *= x;
                gc = gcd(gc,x);
                lcm = (lcm / gcd(lcm,x))*x;
                if(lcm * gc == product) {
                    ans = Math.max(ans,j - i + 1);
                }
            }
        }
        return ans;
    }
    public long gcd(long a,long b) {
        while(b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}