class Solution {
    public int minInsertions(String s) {
        int ans = 0;
        int lc = 0;
        int n = s.length();
        int index = 0;
        while(index < n) {
            char c = s.charAt(index);
            if(c == '(') {
                lc++;
                index++;
            } else {
                if(lc > 0) {
                    lc--;
                } else {
                    ans++;
                }
                if(index < n - 1 && s.charAt(index + 1) == ')') {
                    index += 2;
                } else {
                    ans++;
                    index++;
                }
            }
        }
        ans += (lc*2);
        return ans;
    }
}