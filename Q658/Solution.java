
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int l = 0;
        int r = arr.length - 1;
        while((r - l + 1) > k) {
            int ld = Math.abs(x - arr[l]);
            int rd = Math.abs(x - arr[r]);
            if(ld > rd) {
                l++;
            } else {
                r--;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int i = l;i <= r;i++) {
            ans.add(arr[i]);
        }
        return ans;
    }
}