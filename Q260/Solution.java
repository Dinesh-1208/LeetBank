class Solution {
    public int[] singleNumber(int[] nums) {
        int x = 0;
        for(int i : nums) {
            x ^= i;
        }
        int sbit = x & (-x);
        int a = 0;
        int b = 0;
        for(int i : nums) {
            if((i & sbit) != 0) {
                a ^= i;
            } else {
                b ^= i;
            }
        }
        return new int[] {a,b};
    }
}