class Solution {
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        // Base case: If both are null, they are flip equivalent.
        if (root1 == null && root2 == null) {
            return true;
        }
        
        if (root1 == null || root2 == null || root1.val != root2.val) {
            return false;
        }
        boolean f1 = flipEquiv(root1.left , root2.left);
        boolean f2 = flipEquiv(root1.left , root2.right);

        boolean f3 = flipEquiv(root1.right , root2.right);
        boolean f4 = flipEquiv(root1.right , root2.left);

        return (f1 || f2) && (f3 || f4);

    }
}
