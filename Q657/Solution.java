
/* 
   Problem: 657
   Source: LeetCode
   Language: Java
*/

package Q657;

class Solution {
    public boolean judgeCircle(String moves) {
        int ud = 0;
        int lr = 0;
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'U') {
                ud++;
            } else if (moves.charAt(i) == 'D') {
                ud--;
            } else if (moves.charAt(i) == 'L') {
                lr--;
            } else {
                lr++;
            }
        }
        if (lr == 0 && ud == 0) {
            return true;
        }
        return false;
    }
}