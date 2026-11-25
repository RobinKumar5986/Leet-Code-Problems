class Solution {

    boolean dfs(int start, Map<Integer,List<Integer>> map,boolean[] vis,boolean[] seen){
        if (seen[start]) {
            return true;
        }
        if (vis[start]) {
            return false;
        }

        vis[start] = true;
        seen[start] = true;

        if(map.containsKey(start)) {
            List<Integer> lst = map.get(start);
            for(int ele : lst){
                if(dfs(ele, map, vis,seen)){
                    return true;
                }
            }
        }
        seen[start] = false;
        return false;

    }

    public boolean canFinish(int nc, int[][] req) {
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int[] ele : req){
            if(!map.containsKey(ele[0]))
                map.put(ele[0],new ArrayList<>());
            List<Integer> lst = map.get(ele[0]);
            lst.add(ele[1]);
            map.put(ele[0],lst);
        }
        boolean[] vis = new boolean[nc+1];

        for(Map.Entry<Integer,List<Integer>> ele : map.entrySet()){
            int start = ele.getKey();
            if(vis[start])
                continue;
            boolean[] seen = new boolean[nc+1];
            if(dfs(start, map,vis,seen)){
                return false;
            }
        }
        
        return true;
    }
}