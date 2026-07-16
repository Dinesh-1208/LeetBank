
import java.util.Arrays;

class Solution {
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int mx1 = 0;
        int[] prefixGcd = new int[n];
        for(int i = 0;i < n;i++) {
            mx1 = Math.max(mx1,nums[i]);
            prefixGcd[i] = gcd(nums[i],mx1);
        }
        Arrays.sort(prefixGcd);
        int i = 0;
        int j = n - 1;
        long sum = 0;
        while(i < j) {
            sum += gcd(prefixGcd[i],prefixGcd[j]);
            i++;
            j--;
        }
        return sum;
    }
    static int gcd(int a,int b) {
        while(b != 0) {
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
}