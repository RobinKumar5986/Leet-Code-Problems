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
    int max=0;
    void travers(TreeNode root,int cur){
        if(root==null)return;
        if(cur>max)max=cur;
        travers(root.left,cur+1);
        travers(root.right,cur+1);
    }
    public int maxDepth(TreeNode root) {
        travers(root,1);
        return max;
    }
}