/* 
   Problem: 1859
   Source: LeetCode
   Language: Java
*/
package Q1859;

class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] ans = new String[words.length];
        for (String word : words) {
            int index = word.charAt(word.length() - 1) - '0' - 1;
            ans[index] = word.substring(0, word.length() - 1);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ans.length; i++) {
            sb.append(ans[i]);
            if (i < ans.length - 1)
                sb.append(" ");
        }
        return sb.toString();
    }
}