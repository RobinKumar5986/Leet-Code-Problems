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
    void dfs(TreeNode root){
        if(root == null)
            return;
        
        dfs(root.left);
        dfs(root.right);

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;


    }
    public TreeNode invertTree(TreeNode root) {
        dfs(root);

        return root;

    }
}