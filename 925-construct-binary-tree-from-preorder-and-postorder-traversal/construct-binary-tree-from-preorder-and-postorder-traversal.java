class Solution {
    Map<Integer,Integer> map = new HashMap<>();
    TreeNode treeBuilder(int[] pre, int prSt, int prEnd , int poSt, int poEnd){
        if(prSt > prEnd || poSt > poEnd){
            return null;
        }
        TreeNode node = new TreeNode(pre[prSt]);
        if(prSt+1 <= prEnd){
            int mid = map.get(pre[prSt+1]);
            int leftSz = mid - poSt + 1; // element at prSt + 1 inclusive
            node.left = treeBuilder(pre,prSt+1,prSt + leftSz,poSt,poSt+leftSz-1);
            node.right = treeBuilder(pre,prSt + leftSz + 1 , prEnd, poSt+leftSz , poEnd);
        }
        return node;
    }
    public TreeNode constructFromPrePost(int[] pr, int[] po) {
        for(int i = 0; i < po.length ; i++){
            map.put(po[i],i);
        }
        return treeBuilder(pr,0,pr.length-1,0,po.length-1);
    }
}