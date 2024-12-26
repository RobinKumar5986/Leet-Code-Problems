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
    List<Integer> lst = new ArrayList<>();
    void bfs(Queue<TreeNode> q){
        if(q.isEmpty()) 
            return;
        
        int len = q.size();
        int max = Integer.MIN_VALUE;
        while(len > 0){
            TreeNode node = q.poll();
            max = Math.max(node.val , max);
            if(node.left != null)q.offer(node.left);
            if(node.right != null)q.offer(node.right);
            len--;
        }
        lst.add(max);
        bfs(q);
    }
    public List<Integer> largestValues(TreeNode root) {
        if(root == null)
            return lst;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        bfs(q);
        return lst;
    }
}