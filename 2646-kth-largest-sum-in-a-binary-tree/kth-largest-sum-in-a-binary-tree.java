class Solution {
    PriorityQueue<Long> heap = new PriorityQueue<>();
    void bfs(Queue<TreeNode> q , int k){
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
        if(heap.size() < k ){
            heap.add(sum);
        }else{
            if(heap.peek() < sum){
                heap.poll();
                heap.add(sum);
            }
        }
        bfs(q,k);
    }
    public long kthLargestLevelSum(TreeNode root, int k) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        bfs(q,k);
        if(heap.size() < k) 
            return -1;
        return heap.peek();
    }
}