class Solution {
    Map<TreeNode,Integer> seen = new HashMap<>();
    int dfs(TreeNode root){
        if(root == null){
            return 0;
        }
        if(seen.containsKey(root))
            return seen.get(root);
        //case 1: not rob
        int c1 = dfs(root.left) + dfs(root.right);

        //case 2: rob
        int c2 = root.val;
        if(root.left != null){
            c2 += dfs(root.left.left);
            c2 += dfs(root.left.right);
        }
        if(root.right != null){
            c2 += dfs(root.right.right);
            c2 += dfs(root.right.left);
        }
        int max = Math.max(c1,c2);
        seen.put(root,max);
        return max;

    }
    public int rob(TreeNode root) {
        
        return dfs(root);
    }
}