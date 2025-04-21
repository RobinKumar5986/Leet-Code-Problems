class Solution {
    Map<Node,Node> map = new HashMap<>();
    Node dfs(Node old){
        if(map.containsKey(old))
            return map.get(old);
        Node newNode = new Node(old.val);
        map.put(old,newNode);
        //now need to copy the neg
        for(Node neg : old.neighbors){
            newNode.neighbors.add(dfs(neg));
        }
        return newNode;
    }
    public Node cloneGraph(Node node) {
        if(node == null)
            return null;
        return dfs(node);
    }
}