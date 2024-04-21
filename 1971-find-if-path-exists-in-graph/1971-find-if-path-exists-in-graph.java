class Solution {
    boolean dfs(int node,int dest, HashMap<Integer,List<Integer>> graph,Set<Integer> visited){
        if(node==dest)
            return true;
        visited.add(node);
        for(int n : graph.get(node)){
            if(!visited.contains(n)){
                if(dfs(n,dest,graph,visited))
                    return true;
            }
        }
        return false;
    
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        HashMap<Integer,List<Integer>> graph=new HashMap<>();
        for(int[] ele : edges){
            int key=ele[0];
            int val=ele[1];
            if(!graph.containsKey(key))
                graph.put(key,new ArrayList<>());
            if(!graph.containsKey(val))
                graph.put(val,new ArrayList<>());
            graph.get(key).add(val);
            graph.get(val).add(key);
        }
        Set<Integer> visited=new HashSet<>();
        return dfs(source,destination,graph,visited);
    }
}