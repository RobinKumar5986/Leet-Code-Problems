class Solution {
    List<TreeNode> heads = new ArrayList<>();
    void headFinder(TreeNode root,int val){
        if(root == null)
            return;
        if(root.val == val){
            heads.add(root);
        }
        headFinder(root.left,val);
        headFinder(root.right,val);
    }
    boolean ans = false;
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
        Queue<TreeNode> q = new LinkedList<>();
        headFinder(root,head.val);
        for(TreeNode n : heads){
            q.clear();
            q.offer(n);
            ListNode save = new ListNode();
            save.next = head;

            bfs(q,save.next);
            if(ans)
                return true;
        }
        return false;
    }
}