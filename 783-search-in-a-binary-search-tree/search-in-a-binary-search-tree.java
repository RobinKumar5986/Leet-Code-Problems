class Solution {
    TreeNode ans = null;
    void dfs(TreeNode root,int val){
        if(root == null || ans != null)
            return;
        if(root.val == val){
            ans = root;
            return;
        }
        dfs(root.left,val);
        dfs(root.right,val);
    }
    public TreeNode searchBST(TreeNode root, int val) {
        dfs(root,val);
        return ans;
    }
}