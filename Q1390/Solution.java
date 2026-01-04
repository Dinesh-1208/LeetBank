package Q1390;

class Solution {
    public int sumFourDivisors(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            int sum = 0, count = 0;
            int root = (int) Math.sqrt(num);
            for (int j = 1; j <= root; j++) {
                if (num % j == 0) {
                    int d1 = j;
                    int d2 = num / j;
                    if (d1 == d2) {
                        count++;
                        sum += d1;
                    } else {
                        count += 2;
                        sum += (d1 + d2);
                    }
                }
                if (count > 4)
                    break;
            }
            if (count == 4)
                ans += sum;
        }
        return ans;
    }
}