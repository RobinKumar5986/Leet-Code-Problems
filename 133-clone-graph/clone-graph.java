
class Solution {
    HashMap<Node,Node> map = new HashMap<>();
    Node dfs(Node node){
        if(map.containsKey(node))
            return map.get(node);
        Node copy = new Node(node.val);

        map.put(node,copy);
        for(Node neg : node.neighbors){
            copy.neighbors.add(dfs(neg));
        }
        return copy;
    }
    public Node cloneGraph(Node node) {
        if(node == null)
            return null;
        return dfs(node); 
    }
}