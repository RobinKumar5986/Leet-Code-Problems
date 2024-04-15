class Solution {
    int sum=0;
    void dfs(TreeNode root,int val){
        if(root.left==null && root.right==null){
            sum+=val;
            return;
        }
        if(root.left!=null)
            dfs(root.left,val*10 + root.left.val);
        if(root.right!=null)
            dfs(root.right,val*10 + root.right.val);
    }
    public int sumNumbers(TreeNode root) {
        dfs(root,root.val);
        return sum;
    }
}