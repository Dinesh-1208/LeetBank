/* 
   Problem: 709
   Source: LeetCode
   Language: Java
*/
package Q709;

class Solution {
    public String toLowerCase(String s) {
        char[] ans = s.toCharArray();
        for (int i = 0; i < ans.length; i++) {
            if (ans[i] >= 'A' && ans[i] <= 'Z') {
                ans[i] = (char) (ans[i] - 'A' + 'a');
            }
        }
        return new String(ans);
    }
}