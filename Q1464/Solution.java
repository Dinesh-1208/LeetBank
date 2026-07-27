class Solution {
    public int maxProduct(int[] nums) {
        int num1 = 0;
        int num2 = 0;
        for(int n : nums) {
            if(num1 < n) {
                num2 = num1;
                num1 = n;
            }else if(num2 < n) {
                num2 = n;
            }
        }
        return (num1-1)*(num2-1);
    }
}