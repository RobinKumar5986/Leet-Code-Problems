class Solution {

    int dfs(TreeNode root){
        if(root == null)
            return 0;
        int left = 1 + dfs(root.left);
        int right = 1 + dfs(root.right);

        return Math.max(left,right);
    }
    public int maxDepth(TreeNode root) {
        return dfs(root);
    }
}