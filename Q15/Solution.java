class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0;i < nums.length;i++) {
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            List<List<Integer>> pairs = twoSum(nums, -nums[i], i + 1);
            for(List<Integer> pair : pairs) {
                ans.add(Arrays.asList(nums[i],pair.get(0),pair.get(1)));
            }
        }
        return ans;
    }

    public List<List<Integer>> twoSum(int[] arr, int target,int start) {
        List<List<Integer>> res = new ArrayList<>();
        int l = start;
        int r = arr.length - 1;
        while (l < r) {
            if (arr[l] + arr[r] > target) {
                r--;
            } else if (arr[l] + arr[r] == (target)) {
                res.add(Arrays.asList(arr[l],arr[r]));
                l++;
                r--;
                while (l < r && arr[l] == arr[l - 1]) l++;
                while (l < r && arr[r] == arr[r + 1]) r--;
            } else {
                l++;
            }
        }
        return res;
    }
}