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
    
    public TreeNode invertTree(TreeNode save) {
        if(save==null) return null;     
        TreeNode left=save.left;
        TreeNode right=save.right;

        save.left=right;
        save.right=left;
        
        invertTree(save.left);
        invertTree(save.right);

        return save;
    }
}