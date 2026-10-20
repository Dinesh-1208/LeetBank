class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans = new ArrayList<>();
        int c = 0;
        int freq = 0;
        for(int x : nums) {
            if(x < target) {
                c++;
            }
            if(x == target) {
                freq++;
            }
        }
        for(int i = 0;i < freq;i++) {
            ans.add(c);
            c++;
        }
        return ans;
    }
}