class Solution {
    public boolean uniformArray(int[] nums1) {
        int mini = Integer.MAX_VALUE;
        boolean hasOdd = false;
        for(int num : nums1) {
            if(num < mini) {
                mini = num;
            }
            if((num & 1) == 1) {
                hasOdd = true; 
            }
        }
        if((mini & 1) == 1) {
            return true;
        }
        return !hasOdd;
    }
}