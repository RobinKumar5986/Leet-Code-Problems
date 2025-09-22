class Solution {
    Map<Integer,List<Integer>> map = new HashMap<>();
    boolean[] path;
    boolean[] vis;
    Stack<Integer> stk;

    boolean dfs(int src){
        List<Integer> neg = map.get(src);

        if(path[src]) return true;
        if(vis[src]) return false;

        vis[src] = true;
        path[src] = true;
        if(neg != null ) {
            for(int ele : neg){
                if(dfs(ele)){
                    return true;
                }
            }
        }
        stk.push(src);
        path[src] = false;
        return false;
    }
    public int[] findOrder(int nC, int[][] req) {
        int ans[] = new int[nC];
        if(req.length == 0){
            for(int i = 0 ; i < nC ; i++)
                ans[i] = i;
            return ans;
        }
        path = new boolean[2001];
        vis = new boolean[2001];
        stk = new Stack<>();
        //building the adj matrix
        for(int[] ele : req){
            if(!map.containsKey(ele[0])){
                map.put(ele[0],new ArrayList<>());
            }
            List<Integer> lst = map.get(ele[0]);
            lst.add(ele[1]);
            map.put(ele[0],lst);
        }
        for(Map.Entry<Integer,List<Integer>> ele : map.entrySet()){
            int k = ele.getKey();
            if(!vis[k]){
                if(dfs(k)){
                    return new int[]{};
                }
            }
        }
        int i = nC-1;
        while(!stk.isEmpty()){
            int ele = stk.pop();
            ans[i--] = ele;
        }
        i = 0;
        for(int j = 0 ; j < nC ; j++){
            if(!vis[j]){
                ans[i++] = j;
            }
        }
        return ans;
    }
}