class Solution {
    public String smallestPalindrome(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        char mid = 0;
        for (int i = 0; i < 26; i++) {
            if ((freq[i] & 1) == 1) {
                mid = (char) (i + 'a');
            }
            for (int j = 0; j < freq[i] / 2; j++) {
                sb.append((char) (i + 'a'));
            }
        }
        String left = sb.toString();
        String right = new StringBuilder(left).reverse().toString();
        if (mid != 0) {
            return left + mid + right;
        }
        return left + right;
    }
}