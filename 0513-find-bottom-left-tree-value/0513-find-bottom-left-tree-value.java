class Solution {
    int ans=Integer.MIN_VALUE;
    int max=Integer.MIN_VALUE;
    void dfs(TreeNode root,int height){
        if(root==null)
            return;
        if(root.left==null && root.right==null){
            if(height>max)
            {
                max=height;
                ans=root.val;
            }
            return;
        }
        dfs(root.left,height+1);
        dfs(root.right,height+1);
    }
    public int findBottomLeftValue(TreeNode root) {
        if(root==null) return -1;
        dfs(root,1);
        return ans;
    }
}