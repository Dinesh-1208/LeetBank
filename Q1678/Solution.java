/* 
   Problem: 1678
   Source: LeetCode
   Language: Java
*/

package Q1678;

class Solution {
    public String interpret(String s) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == '(' && s.charAt(i + 1) == ')') {
                sb.append("o");
                i += 2;
            } else if (s.charAt(i) == '(' && s.charAt(i + 1) != ')') {
                sb.append("al");
                i += 4;
            } else {
                sb.append(s.charAt(i));
                i++;
            }
        }
        return sb.toString();
    }
}