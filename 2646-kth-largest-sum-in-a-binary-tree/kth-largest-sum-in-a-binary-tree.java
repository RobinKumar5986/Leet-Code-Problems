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
    List<Long> lst = new ArrayList<>();
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
        lst.add(sum);
        bfs(q);
    }
    public long kthLargestLevelSum(TreeNode root, int k) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        bfs(q);
        Collections.sort(lst);
        for(int i = lst.size()-1 ; i >= 0 ; i--){
            long num = lst.get(i);
            // while( i > 0 && lst.get(i-1) == lst.get(i))
            //     i--;
            k--;
            if(k==0)
                return num;
        }
        return -1;
    }
}