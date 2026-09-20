class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;
        int inf = n+1;
        int[] best = new int[n];
        for(int i = 0;i < n;i++) {
            best[i] = inf;
        }
        int sum = 0;
        int left = 0;
        int ans = inf;
        for(int right = 0;right < n;right++) {
            sum += arr[right];
            while(sum > target) {
                sum -= arr[left];
                left++;
            }
            if(sum == target) {
                int len = right - left + 1;
                if(left > 0 && best[left - 1] != inf) {
                    ans = Math.min(ans,len+best[left - 1]);
                }
                best[right] = len;
            }
            if(right > 0) {
                best[right] = Math.min(best[right],best[right - 1]);
            }
        }
        return ans == inf? -1 : ans;
    }
}