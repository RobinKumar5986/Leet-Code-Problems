class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int level=0;
        while(!q.isEmpty()){
            int s=q.size();
            Integer prev=null;

            for(int i=0;i<s;i++){
                TreeNode node=q.remove();
                if(level%2==0){
                    if(node.val%2==0 || (prev!=null && node.val <= prev ) )
                        return false;
                }else{
                    if(node.val%2==1|| (prev!=null && node.val >= prev ) )
                        return false;
                }

                prev=node.val;
                if(node.left!=null)
                    q.add(node.left);
                if(node.right!=null)
                    q.add(node.right);
            }
            level++;
        }
        return true;
    }
}