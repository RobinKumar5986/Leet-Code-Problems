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
    TreeNode ans = null;
    void dfs(TreeNode root,int val){
        if(root == null || ans != null)
            return;
        if(root.val == val){
            ans = root;
            return;
        }
        dfs(root.left,val);
        dfs(root.right,val);
    }
    public TreeNode searchBST(TreeNode root, int val) {
        dfs(root,val);
        return ans;
    }
}