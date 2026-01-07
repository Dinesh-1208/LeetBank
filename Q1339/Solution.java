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
    long totalSum = 0;
    long maxProd = 0;
    int mod = 1_000_000_007;
    public int maxProduct(TreeNode root) {
        totalSum = totSum(root);
        dfs(root);
        return (int)(maxProd % mod);
    }
    private long totSum(TreeNode node) {
        if(node == null) return 0;
        return node.val + totSum(node.left) + totSum(node.right);
    }
    private long dfs(TreeNode node) {
        if(node == null) return 0;
        long left = dfs(node.left);
        long right = dfs(node.right);
        long subTreeSum = node.val + left +  right;
        long product = subTreeSum * (totalSum - subTreeSum);
        maxProd = Math.max(product,maxProd);
        return subTreeSum;
    }
}