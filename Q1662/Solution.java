
/* 
   Problem: 1662
   Source: LeetCode
   Language: Java
*/
package Q1662;

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb = new StringBuilder();
        for (String w : word1) {
            sb.append(w);
        }
        String s1 = sb.toString();
        sb.setLength(0);
        for (String w : word2) {
            sb.append(w);
        }
        String s2 = sb.toString();
        return s1.equals(s2);
    }
}