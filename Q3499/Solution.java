class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int totalOnes = 0;
        for(char ch : s.toCharArray()) {
            if(ch == '1') totalOnes++;
        }
        int ans = totalOnes;
        String t = "1" + s + "1";
        int n = t.length();
        int i = 1;
        while(i < n-1) {
            if(t.charAt(i) == '0') {
                i++;
                continue;
            }
            int start = i;
            while(i < n && t.charAt(i) == '1') {
                i++;
            }
            int end = i - 1;
            if(start-1 >= 0 && t.charAt(start-1) == '0' && end+1 < n && t.charAt(end+1) == '0') {
                int leftZero = 0;
                int j = start - 1;
                while(j >= 0 && t.charAt(j) == '0') {
                    leftZero++;
                    j--;
                }
                int rightZero = 0;
                j = end + 1;
                while(j < n && t.charAt(j) == '0') {
                    rightZero++;
                    j++;
                }
                ans = Math.max(ans,leftZero + rightZero + totalOnes);
            }
        }
        return ans;
    }
}