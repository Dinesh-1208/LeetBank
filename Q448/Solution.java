
/* 
   Problem: 448
   Source: LeetCode
   Language: Java
*/

package Q448;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        int i = 0;
        while(i<n) {
            int current = arr[i] -1;
            if(arr[i] != arr[current]) {
                int temp = arr[i];
                arr[i] = arr[current];
                arr[current] = temp;
            } else {
                i++;
            }
        }
        for(int j = 0;j<n;j++) {
            if(arr[j] - 1 != j) {
                list.add(j+1);
            }
        }
        return list;
    }
}