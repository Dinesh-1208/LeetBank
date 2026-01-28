import java.util.HashMap;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> ans = new HashMap<>();
        for (int i : nums) {
            if (ans.containsKey(i) && ans.get(i) >= 1) {
                return true;
            }
            ans.put(i, ans.getOrDefault(i, 0) + 1);
        }
        return false;
    }
}