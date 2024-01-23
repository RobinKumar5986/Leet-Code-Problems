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
    boolean balanced=true;
    int chaeck(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=1+chaeck(root.left);
        int right=1+chaeck(root.right);
        if(Math.abs(left-right) > 1 )
            balanced=false;
        return Math.max(left,right);
    }
    public boolean isBalanced(TreeNode root) {
        chaeck(root);
        return balanced;     
    }
}