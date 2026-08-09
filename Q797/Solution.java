import java.util.*;
class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        solve(0, ans, graph, res);
        return res;
    }
    static void solve(int node,List<Integer> ans,int[][] graph,List<List<Integer>> res) {
        if(node == graph.length-1) {
            ans.add(node);
            res.add(new ArrayList<>(ans));
            ans.remove(ans.size() - 1);
            return;
        }
        ans.add(node);
        for(int x : graph[node]) {
            solve(x,ans,graph,res);
        }
        ans.remove(ans.size() - 1);
    }
}