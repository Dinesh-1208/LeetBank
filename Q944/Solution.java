/* 
   Problem: 944
   Source: LeetCode
   Language: Java
*/

class Solution {
    public int minDeletionSize(String[] strs) {
        int c = 0;
        for (int col = 0; col < strs[0].length(); col++) {
            for (int row = 0; row < strs.length - 1; row++) {
                if (strs[row].charAt(col) > strs[row + 1].charAt(col)) {
                    c++;
                    break;
                }
            }
        }
        return c;
    }
}