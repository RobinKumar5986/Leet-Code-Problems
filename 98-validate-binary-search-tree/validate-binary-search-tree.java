class Solution {
    boolean dfs(TreeNode root,long min,long max){
        if(root == null)
            return true;
        if(root.val >= min )
            return false; // for left sub tree
        if(root.val <= max)
            return false; // for righ sub tree
        return dfs(root.left,root.val, max) && dfs(root.right, min,root.val);
        
    }
    public boolean isValidBST(TreeNode root) {
        return dfs(root, Long.MAX_VALUE, Long.MIN_VALUE);
    }
}