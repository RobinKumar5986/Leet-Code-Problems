class Solution {
    int max = Integer.MIN_VALUE;
    int ans = 0;
    void bfs(Queue<TreeNode> stk,int level){
        if(stk.isEmpty())
            return;
        int len = stk.size();
        int sum = 0;

        for(int i = 0 ; i < len; i++){
            TreeNode node = stk.poll();
            sum += node.val;
            if(node.left != null)
                stk.add(node.left);
            if(node.right != null)
                stk.add(node.right);
            
        }
        if(sum > max){
            max = sum;
            ans = level;
        }

        bfs(stk,level+1);

    }
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> stk = new LinkedList<>();
        stk.add(root);
        bfs(stk,1);
        return ans;
    }
}