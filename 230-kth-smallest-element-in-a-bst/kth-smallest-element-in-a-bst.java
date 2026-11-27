class Solution {
    int ans = 0;
    int kth = 0;
    void dfs(TreeNode root) {
        if(root == null)
            return;
        dfs(root.left);
        kth--;
        if(kth == 0)
            ans = root.val;
        dfs(root.right);

    }
    public int kthSmallest(TreeNode root, int k) {
        kth = k;
        dfs(root);
        return ans;
    }
}