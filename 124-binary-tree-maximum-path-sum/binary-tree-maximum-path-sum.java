class Solution {
    int ans = Integer.MIN_VALUE;
    int dfs(TreeNode root){
        if(root == null)
            return 0;
        int left = dfs(root.left);
        int right = dfs(root.right);
        
        if(root.val >= 0){
            int v1 = left + root.val;
            int v2 = right + root.val;
            int v3 = left + right + root.val;
            int v4 = root.val;
            int max = Math.max(v1,Math.max(v2,Math.max(v3,v4)));
            ans = Math.max(ans,max);
            return Math.max(v1,Math.max(v2,v4));

        }else{
            int l = Math.max(0, left);
            int r = Math.max(0, right);
            ans = Math.max(ans, root.val + l + r);
            return root.val + Math.max(l, r);
        }
    }
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return ans;
    }
}