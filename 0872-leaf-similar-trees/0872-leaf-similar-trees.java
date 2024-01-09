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
    String seq="";
    public void sequence(TreeNode root){
        if(root==null) return;
        if(root.left==null && root.right==null) seq=seq+","+root.val;
        sequence(root.left);
        sequence(root.right);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        sequence(root1);
        String s1=seq;
        seq="";
        sequence(root2);
        if(s1.equals(seq)) return true;
        return false;
    }
}