class Solution {
    boolean ans = false;
     Queue<TreeNode> q = new LinkedList<>();
    void headFinder(TreeNode root,ListNode head){
        if(root == null)
            return;
        if(root.val == head.val){
            q.offer(root);
            bfs(q,head);
            if(ans)
                return;
        }
        headFinder(root.left,head);
        headFinder(root.right,head);
    }
    void bfs(Queue<TreeNode> q,ListNode head) {
        while (!q.isEmpty()) {
            int len = q.size();
            boolean found = false;
            for (int i = 0; i < len; i++) {
                TreeNode node = q.poll();
                if (node == null)
                    continue;
                if(head.val == node.val){
                    found = true;
                    if (node.left != null)
                        q.offer(node.left);
                    if (node.right != null)
                        q.offer(node.right);
                }
                
            }
            
            if(!found)
                break;
            if(head.next == null){
                ans = true;
                break;
            }
            head = head.next;
        }
    }
    public boolean isSubPath(ListNode head, TreeNode root) {
        headFinder(root,head);
        return ans;
    }
}