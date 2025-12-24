package Q1763;

class Solution {
    public String longestNiceSubstring(String s) {
        int n = s.length();
        String ans = "";
        if (n < 2)
            return "";
        for (int i = 0; i < n; i++) {
            int lmask = 0;
            int umask = 0;
            for (int j = i; j < n; j++) {
                char c = s.charAt(j);
                if (c >= 'a' && c <= 'z') {
                    lmask |= (1 << (c - 'a'));
                } else {
                    umask |= (1 << (c - 'A'));
                }
                if (lmask == umask) {
                    if (j - i + 1 > ans.length()) {
                        ans = s.substring(i, j + 1);
                    }
                }
            }
        }
        return ans;
    }
}