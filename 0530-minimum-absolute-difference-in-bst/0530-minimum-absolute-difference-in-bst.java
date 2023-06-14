class Solution {
    int minDif = Integer.MAX_VALUE;
    int previousVal = Integer.MAX_VALUE;
    
    public int getMinimumDifference(TreeNode root) {
        exploreTree(root);
        return minDif;
    }
	//inorder-traversal visits a BST in sorted order (left child, root, right child)
    private void exploreTree(TreeNode root) {
        if (root == null) return;
        exploreTree(root.left);
        minDif = Math.min(minDif, Math.abs(previousVal - root.val));
        previousVal = root.val;
        exploreTree(root.right);
    }
}