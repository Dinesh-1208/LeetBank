package Q239;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] output = new int[n-k+1];
        Deque<Integer> deq = new LinkedList<>();
        int l = 0;
        int r = 0;
        while(r < n) {
            while(!deq.isEmpty() && nums[deq.getLast()] < nums[r]) {
                deq.removeLast();
            }
            deq.addLast(r);
            if(l > deq.getFirst()) deq.removeFirst();
            if(r+1 >= k) {
                output[l] = nums[deq.getFirst()];
                l++;
            }
            r++;
        }
        return output;
    }
}
