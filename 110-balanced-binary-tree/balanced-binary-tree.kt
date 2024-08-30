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
    var ans = true
    fun determin(root: TreeNode?): Int {
        if(root == null)
            return 0
        val l = determin(root.left)
        val r = determin(root.right)

        if(abs(l-r) > 1){
            ans = false
        }
        return max(l,r)+1
    }
    fun isBalanced(root: TreeNode?): Boolean {
        if(root == null)
            return true
        determin(root)
        return ans
    }
}