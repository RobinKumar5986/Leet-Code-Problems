class Solution {
    Integer val = null;
    boolean ans = true;
    void dfs(TreeNode root){
        if(root == null || ans == false)
            return;
        if(root.val != val){
            ans = false;
            return;
        }
        dfs(root.left);
        dfs(root.right);
    }
    public boolean isUnivalTree(TreeNode root) {
        if(root == null)
            return true;
        val = root.val;
        dfs(root);
        return ans;
    }
}