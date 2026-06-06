import java.util.*;

class Solution {
    public int minOperations(int[] nums, int[] numsDivide) {
        Arrays.sort(nums);

        int t = g(numsDivide);

        for(int i = 0; i < nums.length; i++) {
            if(t % nums[i] == 0) {
                return i;
            }
        }

        return -1;
    }

    public int g(int[] nums) {
        int ans = nums[0];

        for(int i = 1; i < nums.length; i++) {
            ans = gcd(ans, nums[i]);
        }

        return ans;
    }

    int gcd(int a, int b) {
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}