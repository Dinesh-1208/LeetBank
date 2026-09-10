/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int ans = 0;
    public int averageOfSubtree(TreeNode root) {
        solve(root);
        return ans;
    }
    public int[] solve(TreeNode node) {
        if(node == null) {
            return new int[]{0,0};
        }
        int[] left = solve(node.left);
        int[] right = solve(node.right);
        int sum = left[0] + right[0] + node.val;
        int count = left[1] + right[1] + 1;
        if(node.val == sum/count) {
            ans++;
        }
        return new int[]{sum,count};
    }

    private static class TreeNode {

        private TreeNode left;
        private int val;
        private TreeNode right;

        public TreeNode() {
        }
    }
}