class Solution {
    int ans = 0;
    int kth = 0;
    void dfs(TreeNode root) {
        if(kth <= 0) return;
        if(root.left == null && root.right == null){
            kth--;
            if(kth == 0)
                ans = root.val;
            return;
        }
        if(root.left != null){
            dfs(root.left);
        }
        kth--;
        if(kth == 0)
            ans = root.val;
        if(root.right != null) {
            dfs(root.right);
        }

    }
    public int kthSmallest(TreeNode root, int k) {
        kth = k;
        dfs(root);
        return ans;
    }
}