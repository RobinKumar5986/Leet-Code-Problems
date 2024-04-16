class Solution {
    TreeNode save=new TreeNode(0);

    TreeNode dfs(TreeNode root,int d,int cd,int val ){
        if(d==0){
            TreeNode n=new TreeNode(val);
            n.left=root;
            return n;
        }
        if(root==null){
            return root;
        }
        if(d==cd){
            TreeNode l=new TreeNode(val);
            TreeNode r=new TreeNode(val);
            
            TreeNode left=root.left;
            TreeNode right=root.right;

            l.left=left;
            r.right=right;

            root.left=l;
            root.right=r;

            return root;
        }
        dfs(root.left,d,cd+1,val);
        dfs(root.right,d,cd+1,val);

        return root;

    }
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        root = dfs(root,depth-1,1,val);
        return root;
    }
}