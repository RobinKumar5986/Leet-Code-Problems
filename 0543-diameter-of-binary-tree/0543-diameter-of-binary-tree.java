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
    int max=Integer.MIN_VALUE;
    int traversal(TreeNode root){
        if(root==null)
            return -1;
        int L_H=traversal(root.left);
        int R_H=traversal(root.right);
        max=Math.max(max,L_H+R_H+2); // 2+ for the two edges in each side even with null (-1)
        return Math.max(L_H,R_H)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        traversal(root);
        return max;
    }
}