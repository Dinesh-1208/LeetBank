class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] nums = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            nums[i] = arr[i];
        }
        Arrays.sort(nums,(a,b) -> {
            int diff = setBits(a) - setBits(b);
            if(diff == 0) {
                return a - b;
            }
            return diff;
        });
        for (int i = 0; i < arr.length; i++) {
            arr[i] = nums[i];
        }
        return arr;
    }
    public static int setBits(int num) {
        int count = 0;
        while(num != 0) {
            num = num & (num-1);
            count++;
        }
        return count;
    }
}