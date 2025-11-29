/* 
   Problem: 1678
   Source: LeetCode
   Language: Java
*/
package Q1704;

class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length() / 2;
        int c1 = 0;
        int c2 = 0;
        for (int i = 0; i < n; i++) {
            if ("aeiouAEIOU".indexOf(s.charAt(i)) != -1) {
                c1++;
            }
            if ("aeiouAEIOU".indexOf(s.charAt(n + i)) != -1) {
                c2++;
            }
        }
        return c1 == c2;
    }
}