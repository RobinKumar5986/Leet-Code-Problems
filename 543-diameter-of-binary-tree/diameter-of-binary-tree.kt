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
    var ans = 0 
    fun dia(root: TreeNode?): Int{
        if(root == null){
            return 0
        }
        val left = dia(root.left)
        val right = dia(root.right)

        if(left + right > ans)
            ans = left+right
        return Math.max(left,right) + 1

    }
    fun diameterOfBinaryTree(root: TreeNode?): Int {
        if(root == null)
            return 0
        dia(root)
        return ans
    }
}