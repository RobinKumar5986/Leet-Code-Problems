class Solution {
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        // Base case: If both are null, they are flip equivalent.
        if (root1 == null && root2 == null) {
            return true;
        }
        
        // If only one is null or values don't match, they are not flip equivalent.
        if (root1 == null || root2 == null || root1.val != root2.val) {
            return false;
        }
        
        // Check if children are flip equivalent (without flipping or with flipping).
        return (flipEquiv(root1.left, root2.left) && flipEquiv(root1.right, root2.right)) ||
               (flipEquiv(root1.left, root2.right) && flipEquiv(root1.right, root2.left));
    }
}
