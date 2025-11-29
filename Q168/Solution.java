/* 
   Problem: 27
   Source: LeetCode
   Language: Java
*/
package Q168;

class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            int n = columnNumber % 26;
            sb.append((char) ('A' + n));
            columnNumber /= 26;
        }
        return sb.reverse().toString();
    }
}