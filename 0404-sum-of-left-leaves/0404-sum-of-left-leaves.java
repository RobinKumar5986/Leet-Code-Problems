class Solution {
    int sum=0;
    void dfs(TreeNode root){
        if(root==null)
            return;
        if(root.left!=null){
            if(root.left.left==null && root.left.right==null)
                sum+=root.left.val;
        }
        dfs(root.left);
        dfs(root.right);
    }
    public int sumOfLeftLeaves(TreeNode root) {
       dfs(root);
       return sum;

    }
}