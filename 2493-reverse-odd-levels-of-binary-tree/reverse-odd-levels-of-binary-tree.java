/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    void bfs(Queue<TreeNode> q,int level){
        if(q.isEmpty()) return;

        List<TreeNode> order = new ArrayList<>();
        List<Integer> reverse = new ArrayList<>();
        int len = q.size();
        while(len > 0){
            TreeNode node = q.poll();
            if(node.left != null) {
                q.offer(node.left);
                order.add(node.left);
                reverse.add(node.left.val);
            }
            
            if(node.right != null){ 
                q.offer(node.right);
                order.add(node.right);
                reverse.add(node.right.val);
            }
            len--;
        }
        //need to swich the valuse from last to fist 
        if(level % 2 == 0){
            int ind = order.size() - 1;
            for(int i = 0 ; i < order.size() ; i++){
                order.get(i).val = reverse.get(ind--);
            }
        }
        bfs(q,++level);
    }
    public TreeNode reverseOddLevels(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        bfs(q,0);
        return root;
    }
}