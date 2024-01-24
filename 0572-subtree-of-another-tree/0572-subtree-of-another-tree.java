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
    boolean ans=false;
    boolean match(TreeNode root,TreeNode subroot){
        if( (root==null && subroot!=null)||(root!=null && subroot==null) )
            return false;
        if(root==null && subroot==null)
            return true;
        if(root.val!=subroot.val)
            return false;
        return match(root.left,subroot.left) && match(root.right,subroot.right);
    }
    void check(TreeNode root,TreeNode subRoot){
        if(root==null)
            return;
        if(root.val==subRoot.val){
            if(match(root,subRoot)){
                ans=true;
                return;
            }
        }
        check(root.left,subRoot);
        check(root.right,subRoot);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        check(root,subRoot);
        return ans;
    }
}