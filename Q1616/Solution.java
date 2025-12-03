/* 
   Problem: 1616
   Source: LeetCode
   Language: Java
*/
package Q1616;

class Solution {
    public boolean checkPalindromeFormation(String a, String b) {
        if (a.length() == 1 || b.length() == 1)
            return true;
        return check(a, b) || check(b, a);
    }

    private boolean check(String a, String b) {
        int i = 0;
        int j = b.length() - 1;
        while (i < j && a.charAt(i) == b.charAt(j)) {
            i++;
            j--;
        }
        return isPal(a, i, j) || isPal(b, i, j);
    }

    private boolean isPal(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }
}
