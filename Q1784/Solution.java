/* 
   Problem: 1784
   Source: LeetCode
   Language: Java
*/
package Q1784;

class Solution {
    public boolean checkOnesSegment(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }
        boolean seenZero = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                seenZero = true;
            } else {
                if (seenZero) {
                    return false;
                }
            }
        }
        return true;
    }
}