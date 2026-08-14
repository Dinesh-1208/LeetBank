class Solution {
    public int maximumLengthSubstring(String s) {
        int n = s.length();
        int left = 0;
        int ans = 0;
        int[] arr = new int[26];
        for(int right = 0;right < n;right++) {
            char ch = s.charAt(right);
            arr[ch - 'a']++;
            while(arr[ch - 'a'] > 2) {
                arr[s.charAt(left) - 'a']--;
                left++;
            }
            ans = Math.max(ans,right - left + 1);
        }
        return ans;
    }
}