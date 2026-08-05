import java.util.*;
class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0;i < n;i++) {
            graph.add(new ArrayList<>());
        }
        for(int[] edge : invocations) {
            int u = edge[0];
            int v = edge[1];
            graph.get(u).add(v);
        }
        HashSet<Integer> hs = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        q.offer(k);
        while(!q.isEmpty()) {
            int node = q.poll();
            hs.add(node);
            for(int next : graph.get(node)) {
                if(!hs.contains(next)) {
                    hs.add(next);
                    q.offer(next);
                }
            }
        }
        boolean canRemove = true;
        for(int[] edge : invocations) {
            int u = edge[0];
            int v = edge[1];
            if(!hs.contains(u) && hs.contains(v)) {
                canRemove = false;
                break;
            }
        }
        List<Integer> ans = new ArrayList<>();
        if(canRemove) {
            for(int i = 0;i < n;i++) {
                if(!hs.contains(i)) {
                    ans.add(i);
                }
            }
        } else {
            for(int i = 0;i < n;i++) {
                ans.add(i);
            }
        }
        return ans;
    }
}