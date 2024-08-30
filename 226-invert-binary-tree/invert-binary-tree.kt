/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun invert(root: TreeNode){
        if(root.left == null && root.right == null)
            return
        val temp = root.left;
        root.left = root.right;
        root.right = temp;

        if(root.left!= null){
            invert(root.left)
        }
        if(root.right!= null){
            invert(root.right)
        }
    }
    fun invertTree(root: TreeNode?): TreeNode? {
        if(root == null)
            return null;
        invert(root)
        return root;
    }
}