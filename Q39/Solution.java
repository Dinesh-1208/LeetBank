
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> curr = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        solve(0,target,candidates,ans,curr);   
        return ans;
    }
    void solve(int index,int target,int[] arr,List<List<Integer>> ans,List<Integer> curr) {
        if(target == 0) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        if(target < 0 || index == arr.length) {
            return;
        }
        curr.add(arr[index]);
        solve(index,target - arr[index],arr,ans,curr);
        curr.remove(curr.size() - 1);

        solve(index+1,target,arr,ans,curr);
    }
}