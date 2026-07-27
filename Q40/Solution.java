class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> curr = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
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
        for(int i = index;i < arr.length;i++) {
            if(i > index && arr[i] == arr[i-1]) continue;
            curr.add(arr[i]);
            solve(i+1,target - arr[i],arr,ans,curr);
            curr.remove(curr.size() - 1);
        }
    }
}