
class Solution {
    List<Integer> lSum = new ArrayList<>();
    void bfs(Queue<TreeNode> q){
        if(q.isEmpty())
            return;
        int len = q.size();
        int sum = 0;
        for(int i = 0;i<len;i++){
            TreeNode node = q.poll();
            sum += node.val;
            if(node.left != null){
                q.offer(node.left);
            }
            if(node.right != null){
                q.offer(node.right);
            }
        }
        lSum.add(sum);
        bfs(q);
    }
    void bfs2(Queue<TreeNode> q,int level){
        if(q.isEmpty())
            return;
        int len = q.size();
        for(int i = 0;i<len;i++){
            TreeNode node = q.poll();
            int sum = 0;

            if(node.right != null)
                sum += node.right.val;
            if(node.left != null)
                sum += node.left.val;
            
            int ls = 0;
            if(level + 1 < lSum.size())
                ls = lSum.get(level + 1);
            sum = ls - sum;
            if(node.right != null){
                node.right.val = sum;
                q.offer(node.right);
            }
            if(node.left != null){
                node.left.val = sum;
                q.offer(node.left);
            }
            
        }
        bfs2(q,level+1);
    }
    public TreeNode replaceValueInTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        bfs(q);
        q.add(root);
        bfs2(q,0);
        root.val  = 0 ;
        return root;
    }
}