class Solution {
    public int smallestIndex(int[] nums) {
        for(int i = 0;i < nums.length;i++) {
            int sum = sumofDigits(nums[i]);
            if(sum == i) {
                return i;
            }
        }
        return -1;
    }
    int sumofDigits(int n) {
        int sum = 0;
        while(n != 0) {
            int l = n % 10;
            sum += l;
            n /= 10;
        }
        return sum;
    }
}