class Solution {
    List<Integer> lst = new ArrayList<>();
    void dfs(TreeNode root) {
        if(root == null)
            return;
        dfs(root.left);
        lst.add(root.val);
        dfs(root.right);

    }
    public int kthSmallest(TreeNode root, int k) {
        dfs(root);
        return lst.get(k-1);
    }
}