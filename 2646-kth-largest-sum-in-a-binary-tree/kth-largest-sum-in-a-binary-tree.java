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
    PriorityQueue<Long> heap = new PriorityQueue<>(Collections.reverseOrder());
    void bfs(Queue<TreeNode> q){
        if(q.isEmpty()){
            return;
        }
        int size = q.size();
        long sum = 0;
        for(int i = 0 ; i<size ;i++){
            TreeNode root = q.poll();
            sum += root.val;
            if(root.left != null)
                q.add(root.left);
            if(root.right != null)
                q.add(root.right);
        }
        heap.add(sum);
        bfs(q);
    }
    public long kthLargestLevelSum(TreeNode root, int k) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        bfs(q);
        while(k>0 && !heap.isEmpty()){
            long ans = heap.poll();
            k--;
            if( k == 0)
                return ans;
        }
        return -1;
    }
}