
import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        HashMap<Integer,Integer> mp = new HashMap<>();
        int[] temp = Arrays.copyOf(arr,n);
        Arrays.sort(temp);
        int rank = 1;
        for(int i = 0;i < n;i++) {
            if(i > 0 && temp[i] > temp[i-1]) {
                rank++;
            }
            mp.put(temp[i],rank);
        }
        for(int i = 0;i < n;i++) {
            arr[i] = mp.get(arr[i]);
        }
        return arr;
    }
}