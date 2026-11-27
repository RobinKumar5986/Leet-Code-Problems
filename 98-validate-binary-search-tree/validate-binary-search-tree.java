class Solution {
    List<Integer> lst = new ArrayList<>();
    void dfs(TreeNode root){
        if(root == null)
            return;
        dfs(root.left);
        lst.add(root.val);
        dfs(root.right);
    }
    public boolean isValidBST(TreeNode root) {
        dfs(root);
        for(int i = 1; i < lst.size(); i++){
            if(lst.get(i-1) >= lst.get(i))
                return false;
        }
        return true;
    }
}