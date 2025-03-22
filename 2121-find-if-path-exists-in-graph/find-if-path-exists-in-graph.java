class Solution {
    //Map for all the neighbours of the node.
    Map<Integer,List<Integer>> map = new HashMap<>();
    Set<Integer> vis = new HashSet<>();
    boolean ans = false;
    void bfs(Queue<Integer> q, int dest){
        if(q.isEmpty() || ans == true)
            return;
        int sz = q.size();
        for(int i = 0 ; i < sz ; i++){
            int node = q.remove();
            if(node == dest){
                ans = true;
                return;
            }
            List<Integer> neg = map.get(node);
            for(int ele : neg){
                if(ele == dest){
                    ans = true;
                    return;
                }
                if(!vis.contains(ele)){
                    q.offer(ele);
                    vis.add(ele);
                }
            }
        }
        bfs(q,dest);
     
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Queue<Integer> q = new LinkedList<>();
        map(edges);
        vis.add(source);
        q.offer(source);
        int x = 0;
        bfs(q,destination);
        return ans;
    }
    void map(int[][] edges){
         for(int[] ele : edges){
            if(!map.containsKey(ele[0]))
                map.put(ele[0], new ArrayList<>());
            if(!map.containsKey(ele[1]))
                map.put(ele[1],new ArrayList<>());
            List<Integer> l1 = map.get(ele[0]);
            l1.add(ele[1]);
            List<Integer> l2 = map.get(ele[1]);
            l2.add(ele[0]);   
        }
    }
}