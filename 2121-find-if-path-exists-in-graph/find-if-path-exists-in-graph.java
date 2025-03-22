class Solution {
    Map<Integer,List<Integer>> map = new HashMap<>();
    Set<Integer> vis = new HashSet<>();
    boolean ans = false;
    void bfs(Queue<Integer> q, int dest){
        if(q.isEmpty() || ans == true)
            return;
        int sz = q.size();
        for(int i = 0 ; i < sz ; i++){
            int node = q.poll();
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
    public boolean validPath(int n, int[][] edges, int src, int dst) {
        map(edges);
        Queue<Integer> q = new LinkedList<>();
        q.offer(src);
        vis.add(src);
        bfs(q,dst);

        return ans;
    }

    void map(int[][] edg){
        for(int[] ele : edg){
            if(!map.containsKey(ele[0]))
                map.put(ele[0],new ArrayList<>());
            if(!map.containsKey(ele[1]))
                map.put(ele[1],new ArrayList<>());
            List<Integer> lst1 = map.get(ele[0]);
            lst1.add(ele[1]);
            map.put(ele[0],lst1);

            List<Integer> lst2 = map.get(ele[1]);
            lst2.add(ele[0]);
            map.put(ele[1],lst2);
        }
    }
}