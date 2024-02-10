class Solution {
    int globalK;
    int ans=-1;
    void dfsInorder(TreeNode root){
        if(root==null)
            return;
        dfsInorder(root.left);
        globalK--;
        if(globalK==0){
            ans=root.val;
            return;
        }
        dfsInorder(root.right);
    }
    public int kthSmallest(TreeNode root, int k) {
        globalK=k;
        dfsInorder(root);
        return ans;
    }
}