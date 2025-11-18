
/* 
   Problem: 717
   Source: LeetCode
   Language: Java
*/

package Q717;

class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int n = bits.length;
        int i = 0;
        while (i < bits.length) {
            if (bits[i] == 1) {
                i += 2;
                if (i > n - 1) {
                    return false;
                }
            } else {
                i++;
            }
        }
        return true;
    }
}