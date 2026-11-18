class Solution {
    public int minChanges(String s) {
        char[] ch = s.toCharArray();
        int i = 1;
        int ans = 0;
        while(i < s.length()) {
            if(ch[i] != ch[i - 1]) {
                ans++;
            }
            i += 2;
        }
        return ans;
    }
}