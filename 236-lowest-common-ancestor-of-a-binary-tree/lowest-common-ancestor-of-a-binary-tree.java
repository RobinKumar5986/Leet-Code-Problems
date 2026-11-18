/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    Map<Integer,TreeNode> map = new HashMap<>();

    void dfs(TreeNode root, TreeNode parent){
        if(root == null)
            return;
        if(parent != null){
            map.put(root.val,parent);
        }
        dfs(root.left, root);
        dfs(root.right, root);
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root, null);
        TreeNode left = p;
        Map<Integer,TreeNode> path = new HashMap<>();

        while(true) {
            if(!map.containsKey(left.val)) break;
            TreeNode node = map.get(left.val);
            path.put(node.val,node);
            if(node.val == q.val)
                return q;
            left = node;
        }
        TreeNode right = q;
        while(true){
            if(!map.containsKey(right.val))
                break;
            TreeNode node = map.get(right.val);
            if(node.val == p.val)
                return p;
            if(path.containsKey(node.val)){
                return path.get(node.val);
            }
            right = node;
        }
        
        return new TreeNode();
    }
}