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
    var max = -1
    fun depth(root: TreeNode? , cur : Int){
        if(root == null)
            return
        if(cur > max)
            max = cur
        if(root.left != null)
            depth(root.left , cur+1)
        if(root.right != null)
            depth(root.right , cur+1)
    }
    fun maxDepth(root: TreeNode?): Int {
        if(root == null)
            return 0
        depth(root , 1)
        return max
    }
}