class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        String ans = "";
        int minlen = Integer.MAX_VALUE;
        int l = 0;
        int c = 0;
        int r = 0;
        while(r < s.length()) {
            if(s.charAt(r) == '1') {
                c++;
            }
            if(c > k) {
                while(s.charAt(l) != '1') {
                    l++;
                }
                l++;
                c--;
                while(s.charAt(l) == '0') {
                    l++;
                }
            }
            if(c == k) {
                while(s.charAt(l) != '1') {
                    l++;
                }
                int len = r - l + 1;
                String candid = s.substring(l,r+1);
                if(len < minlen) {
                    minlen = len;
                    ans = candid;
                } else if(len == minlen && candid.compareTo(ans) < 0) {
                    ans = candid;
                }
            }
            r++;
        }
        return ans;
    }
}