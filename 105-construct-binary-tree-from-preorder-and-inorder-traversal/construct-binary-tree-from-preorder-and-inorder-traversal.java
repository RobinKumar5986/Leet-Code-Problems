class Solution {
    Map<Integer, Integer> map = new HashMap<>();
    TreeNode builder(int[] pre, int preSt, int preEnd,int inSt,int inEnd){
        if(preSt > preEnd || inSt > inEnd)
            return null;
        TreeNode node = new TreeNode(pre[preSt]);
        int mid = map.get(pre[preSt]);
        int szLeft = mid - inSt;

        node.left = builder(pre, preSt + 1, preSt + szLeft, inSt, mid - 1);
        node.right = builder(pre, preSt + szLeft + 1 , preEnd, mid + 1 ,inEnd);

        return node;

    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i = 0 ; i < inorder.length ; i++)
            map.put(inorder[i] , i);
        return builder(preorder, 0 , preorder.length-1, 0, inorder.length-1);
    }
}