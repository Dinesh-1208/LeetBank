/* 
   Problem: 1309
   Source: LeetCode
   Language: Java
*/
package Q1309;

class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        int i = s.length() - 1;
        while (i >= 0) {
            if (s.charAt(i) == '#') {
                int num = Integer.parseInt(s.substring(i - 2, i));
                sb.append((char) (num - 1 + 'a'));
                i -= 3;
            } else {
                sb.append((char) (s.charAt(i) - '0' - 1 + 'a'));
                i--;
            }
        }
        return sb.reverse().toString();
    }
}
