/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null)
            return null;
        else if(root==p || root==q)
            return root;
        else if( (root.val>p.val && root.val < q.val) || (root.val>q.val && root.val < p.val) )
            return root;
        else if(root.val > p.val)
            return lowestCommonAncestor(root.left,p,q);
        else 
            return lowestCommonAncestor(root.right,p,q);
    }
}