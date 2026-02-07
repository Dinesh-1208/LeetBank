package Q344;

class Solution {
    public void reverseString(char[] s) {
        int l = 0;
        int e = s.length - 1;
        while (l < e) {
            char temp = s[e];
            s[e] = s[l];
            s[l] = temp;
            l++;
            e--;
        }
    }
}