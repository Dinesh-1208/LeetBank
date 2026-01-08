class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int start = 0, end = 0;
        for (int i = 0; i < n; i++) {
            int pat1 = expand(s, i, i);
            int pat2 = expand(s, i, i + 1);
            int len = Math.max(pat1, pat2);
            if (len > (end - start + 1)) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && (s.charAt(left) == s.charAt(right))) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}