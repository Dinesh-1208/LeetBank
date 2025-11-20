
/* 
   Problem: 27
   Source: LeetCode
   Language: Java
*/

package Q27;

class Solution {
    public int removeElement(int[] arr, int val) {
        int n = arr.length;
        int i = 0;
        while(i < n) {
            if(val == arr[n-1]) {
                n--;
            } else if(arr[i] == val) {
                int temp = arr[n-1];
                arr[i] = temp;
                arr[n-1] = val;
                i++;
                n--;
            } else {
                i++;
            }
        }
        return n;
    }
}