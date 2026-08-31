class Solution {
    public String lexGreaterPermutation(String s, String target) {
        int n = s.length();
        int[] freq = new int[26];
        for(char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        int i = 0;
        while(i < n) {
            int idx = target.charAt(i) - 'a';
            if(freq[idx] == 0) {
                break;
            }
            freq[idx]--;
            i++;
        }
        if(i == n) {
            i--;
            freq[target.charAt(i) - 'a']++;
        }

        while(i >= 0) {
            int targetChar = target.charAt(i) - 'a';
            for(int c = targetChar+1;c < 26;c++) {
                if(freq[c] > 0) {
                    StringBuilder ans = new StringBuilder();
                    ans.append(target, 0, i);
                    ans.append((char) ('a' + c));
                    freq[c]--;
                    for (int x = 0; x < 26; x++) {
                        while (freq[x] > 0) {
                            ans.append((char) ('a' + x));
                            freq[x]--;
                        }
                    }
                    return ans.toString();
                }
            }
            i--;
            if (i >= 0) {
                freq[target.charAt(i) - 'a']++;
            }
        }
        return "";
    }
}