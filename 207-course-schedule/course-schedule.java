class Solution {
    Map<Integer,List<Integer>> map = new HashMap<>();
    boolean[] vis;
    boolean[] path;
    boolean dfs(int src){
        List<Integer> neg = map.get(src);
        if(neg == null)
            return false;
        //first current path check to avoid perv path check
        if(path[src]){
            return true;
        }
        if(vis[src])
            return false;
        vis[src] = true;
        path[src] = true;
        for(int ele : neg){
            if(dfs(ele)){
                return true;
            }
        }
        path[src] = false;
        return false;
    }
    public boolean canFinish(int nC, int[][] req) {
        vis = new boolean[2001];
        path = new boolean[2001];
        //creating adj metrix
        for(int i = 0 ; i < req.length; i++){
            int[] node = req[i];
            if(!map.containsKey(node[0])){
                map.put(node[0],new ArrayList<>());
            }
            List<Integer> lst = map.get(node[0]);
            lst.add(node[1]);
            map.put(node[0],lst);
        }
        //running the dfs
        for(Map.Entry<Integer,List<Integer>> ele : map.entrySet()){
            int src = ele.getKey();
            if(dfs(src))
                return false;
        }
        return true;
    }
}