class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int len = q.size();
            List<Integer> lst = new ArrayList<>();
            for(int i = 0; i < len; i++){
                TreeNode node = q.poll();
                lst.add(node.val);
                if(node.left != null)
                    q.add(node.left);
                if(node.right != null)
                    q.add(node.right);
            }
            ans.add(lst);

        }

        return ans;
    }
}