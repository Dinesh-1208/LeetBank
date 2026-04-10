import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    private List<List<Integer>> ans;
    private List<Integer> temp;

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        temp = new ArrayList<>();
        ans = new ArrayList<>();
        ksum(nums, 4, 0, (long) target);
        return ans;
    }

    private void ksum(int[] nums, int k, int start, long target) {
        if (k == 2) {
            int l = start;
            int e = nums.length - 1;
            while (l < e) {
                long sum = (long) nums[l] + nums[e];
                if (sum > target) {
                    e--;
                } else if (sum < target) {
                    l++;
                } else {
                    ans.add(new ArrayList<>(temp));
                    ans.get(ans.size() - 1).add(nums[l]);
                    ans.get(ans.size() - 1).add(nums[e]);
                    l++;
                    e--;
                    while (l < e && nums[l] == nums[l - 1])
                        l++;
                    while (l < e && nums[e] == nums[e + 1])
                        e--;
                }
            }
            return;
        }

        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1])
                continue;
            temp.add(nums[i]);
            ksum(nums, k - 1, i + 1, target - nums[i]);
            temp.remove(temp.size() - 1);
        }
    }
}