
/* 
   Problem: 557
   Source: LeetCode
   Language: Java
*/
package Q557;

class Solution {
    public String reverseWords(String s) {
        char[] st = s.toCharArray();
        int start = 0;
        int n = s.length();
        for (int i = 0; i <= n; i++) {
            if (i == n || st[i] == ' ') {
                reverse(st, start, i - 1);
                start = i + 1;
            }
        }
        return new String(st);
    }

    private void reverse(char[] arr, int l, int r) {
        while (l < r) {
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}
