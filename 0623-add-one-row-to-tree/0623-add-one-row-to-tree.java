class Solution {
    TreeNode bfs(TreeNode root,int d,int cd,int val ){
        if(d==0){
            TreeNode n=new TreeNode(val);
            n.left=root;
            return n;
        }
        Queue<TreeNode> nodes=new LinkedList<>();
        nodes.add(root);
        while(!nodes.isEmpty()){
            int size=nodes.size();
            for(int i=0;i<size;i++){
                TreeNode n=nodes.remove();
                if(cd==d){

                    TreeNode l=new TreeNode(val);
                    TreeNode r=new TreeNode(val);

                    l.left=n.left;
                    r.right=n.right;

                    n.left=l;
                    n.right=r;
                }
                if(n.left!=null)
                    nodes.add(n.left);
                if(n.right!=null)
                    nodes.add(n.right);
            }
            if(cd==d)
                return root;
            cd++;
        }
        return root;
    }
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        return bfs(root,depth-1,1,val);
    }
}