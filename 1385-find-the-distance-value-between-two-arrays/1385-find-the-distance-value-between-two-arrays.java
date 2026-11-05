class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int c = 0;
        for(int x : arr1) {
            boolean isGood = true;
            for(int y : arr2) {
                if(Math.abs(x - y) <= d) {
                    isGood = false;
                    break;
                }
            }
            if(isGood) c++;
        }
        return c;
    }
}