class Solution {
    public int findGCD(int[] nums) {
        int s = nums[0];
        int e = nums[0];
        for(int x : nums) {
            if(s > x) {
                s = x;
            }
            if(e < x) {
                e = x;
            }
        }
        return gcd(s,e);
    }
    static int gcd(int a,int b) {
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}