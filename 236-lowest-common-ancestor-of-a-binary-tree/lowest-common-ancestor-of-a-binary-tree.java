class Solution {
    Map<Integer,TreeNode> map = new HashMap<>();
    boolean pS = false;
    boolean qS = false;
    void dfs(TreeNode root, TreeNode parent,int p, int q){
        if(pS && qS) 
           return;
        if(root == null)
            return;
        if(parent != null){
            if(root.val == p)
                pS = true;
            if(root.val == q)
                qS = true;
            map.put(root.val,parent);
        }
        dfs(root.left, root,p,q);
        dfs(root.right, root,p,q);
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root, null,p.val,q.val);
        TreeNode left = p;
        Set<Integer> path = new HashSet<>();

        while(true) {
            if(!map.containsKey(left.val)) break;
            TreeNode node = map.get(left.val);
            path.add(node.val);
            if(node.val == q.val)
                return q;
            left = node;
        }
        TreeNode right = q;
        while(true){
            if(!map.containsKey(right.val))
                break;
            TreeNode node = map.get(right.val);
            if(node.val == p.val)
                return p;
            if(path.contains(node.val)){
                return node;
            }
            right = node;
        }
        
        return new TreeNode();
    }
}