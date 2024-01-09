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
    List<Integer> seq=new ArrayList<>();
    public void sequence(TreeNode root){
        if(root==null) return;
        if(root.left==null && root.right==null) seq.add(root.val);
    
        sequence(root.left);
        sequence(root.right);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        sequence(root1);
        List<Integer> seq1=new ArrayList<>(seq);
        seq.clear();
        sequence(root2);
        if( Arrays.equals(seq1.toArray(),seq.toArray() ) ) return true;
        return false;
    }
}