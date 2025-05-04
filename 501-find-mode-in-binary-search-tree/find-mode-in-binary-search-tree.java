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
    HashMap<Integer,Integer> map = new HashMap<>();
    int max = Integer.MIN_VALUE;
    void dfs(TreeNode root){
        if(root == null)
            return;
        map.put(root.val,map.getOrDefault(root.val,0)+1);
        max = Math.max(max, map.get(root.val));
        dfs(root.left);
        dfs(root.right);

    }
    public int[] findMode(TreeNode root) {
        dfs(root);
        List<Integer> ans = new ArrayList<>();
        for(Map.Entry<Integer,Integer> ele : map.entrySet()){
            int key = ele.getKey();
            int val = ele.getValue();
            if(val == max)
                ans.add(key);
        }                
        int[] arr = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            arr[i] = ans.get(i);
        }
        return arr;
    }
}