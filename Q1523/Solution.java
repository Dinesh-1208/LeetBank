/* 
   Problem: 1523
   Source: LeetCode
   Language: Java
*/

class Solution {
    public int countOdds(int low, int high) {
        if (low == 0 && high == 0)
            return 0;
        int n = high - low + 1;
        if (low % 2 != 0 && high % 2 != 0) {
            return (n / 2) + 1;
        }
        return n / 2;
    }
}