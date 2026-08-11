import java.util.HashSet;
import java.util.Set;

class Solution {
    public int missingInteger(int[] nums) {
        Set<Integer> hs = new HashSet<>();
        for(int i : nums) {
            hs.add(i);
        }
        int total = nums[0];
        for(int i = 1;i < nums.length;i++) {
            if(nums[i] != nums[i-1]+1) {
                break;
            }
            total += nums[i];
        }
        while(hs.contains(total)) {
            total++;
        }
        return total;
    }
}