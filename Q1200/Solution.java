import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        int mini = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            mini = Math.min(mini, arr[i] - arr[i - 1]);
        }
        for (int i = 1; i < n; i++) {
            if (arr[i] - arr[i - 1] == mini) {
                ans.add(new ArrayList<>(List.of(arr[i - 1], arr[i])));
            }
        }
        return ans;
    }
}