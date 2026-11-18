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
    boolean dfs(TreeNode root,long min,long max){
        if(root == null)
            return true;
        if(root.val >= min )
            return false; // for left sub tree
        if(root.val <= max)
            return false; // for righ sub tree
        return dfs(root.left,Math.min(min,root.val), max) && dfs(root.right, min, Math.max(max,root.val));
        
    }
    public boolean isValidBST(TreeNode root) {
        return dfs(root, Long.MAX_VALUE, Long.MIN_VALUE);
    }
}