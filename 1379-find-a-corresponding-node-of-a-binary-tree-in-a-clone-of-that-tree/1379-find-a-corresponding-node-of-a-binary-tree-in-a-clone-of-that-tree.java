class Solution {
    TreeNode val=null;
    void travel(TreeNode root,TreeNode target){
        if(root==null)
            return;
        if(root.val==target.val){
            val=root;
            return;
        }
        travel(root.left,target);
        travel(root.right,target);

    }
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        travel(cloned,target);
        return val;
    }
}