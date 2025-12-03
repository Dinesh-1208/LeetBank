
/* 
   Problem: 848
   Source: LeetCode
   Language: Java
*/

package Q848;

class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        for (int i = (shifts.length) - 2; i >= 0; i--) {
            shifts[i] = (shifts[i] + shifts[i + 1]) % 26;
        }
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < shifts.length; j++) {
            int shift = shifts[j];
            char c = s.charAt(j);
            char shiftedChar = (char) (((c - 'a') + shift) % 26 + 'a');
            sb.append(shiftedChar);
        }
        return sb.toString();
    }
}