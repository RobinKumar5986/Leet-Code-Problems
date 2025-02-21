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
class FindElements {
    Set<Integer> set = new HashSet<>();
    void recover(TreeNode st,int parent){
        if(st == null)
            return;
        if(st.left != null){
            st.left.val = parent * 2 + 1;
            set.add(st.left.val);
            recover(st.left,st.left.val);
        }
        if(st.right != null){
            st.right.val = parent * 2 + 2;
            set.add(st.right.val);
            recover(st.right,st.right.val);
        }
    }
    public FindElements(TreeNode root) {
        set.add(0);
        root.val = 0;
        recover(root,0);
    }
    
    public boolean find(int target) {
        return set.contains(target);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */