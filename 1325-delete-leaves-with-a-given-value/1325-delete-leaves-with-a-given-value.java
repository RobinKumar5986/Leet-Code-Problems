class Solution {
    TreeNode dfs(TreeNode root,int target){
        if(root==null)
            return null;
        root.left=dfs(root.left,target);
        root.right=dfs(root.right,target);

        if(root.left==null && root.right==null && root.val==target)
            return null;
        else
            return root;
    }
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        return dfs(root,target);
    }
}