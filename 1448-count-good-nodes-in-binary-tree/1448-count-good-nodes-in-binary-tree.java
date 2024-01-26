class Solution {
    
    int count=0;
    public void dfs(TreeNode root,int parent){
        if(root==null)
            return;
        if(parent<=root.val)
            count++;
        if(root.val > parent){
            parent=root.val;
        }
        dfs(root.left,parent);
        dfs(root.right,parent);
    }
    public int goodNodes(TreeNode root) {
        dfs(root,root.val);
        return count;
    }
}