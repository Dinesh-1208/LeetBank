import java.util.*;
class Solution {
    class Project {
        int cost;
        int profit;
        public Project(int cost,int profit) {
            this.cost = cost;
            this.profit = profit;
        }
    }
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        PriorityQueue<Project> costHeap = new PriorityQueue<>(
            (a,b) -> a.cost - b.cost
        );
        PriorityQueue<Integer> profitHeap = new PriorityQueue(
            Collections.reverseOrder()
        );
        for(int i = 0;i < profits.length;i++) {
            costHeap.offer(new Project(capital[i],profits[i]));
        }
        for(int i = 0;i < k;i++) {
            while(!costHeap.isEmpty() && costHeap.peek().cost <= w) {
                Project p = costHeap.poll();
                profitHeap.offer(p.profit);
            }
            if(profitHeap.isEmpty()) {
                break;
            }
            w += profitHeap.poll();
        }
        return w;
    }
}