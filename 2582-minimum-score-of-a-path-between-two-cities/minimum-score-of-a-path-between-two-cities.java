class Solution {
    Map<Integer,Set<Integer>> path = new HashMap<>();
    Map<String,Integer> cost = new HashMap<>();

    int ans =  Integer.MAX_VALUE;
    void dfs(int root, int dest,Set<Integer> vis) {
        if(vis.contains(root)){ return; }
        vis.add(root);
        Set<Integer> branch = path.get(root);
        for(int ele : branch){
            String key = root +":"+ele;
            ans = Math.min(ans,cost.get(key));
            dfs(ele,dest,vis);
        }
    }
    public int minScore(int n, int[][] roads) {
        for(int[] ele : roads){
            int s = ele[0];
            int d = ele[1];
            int c = ele[2];

            if(!path.containsKey(s)){
                path.put(s,new HashSet<>());
            }
            if(!path.containsKey(d)){
                path.put(d,new HashSet<>());
            }
            Set<Integer> s1 = path.get(s);
            Set<Integer> s2 = path.get(d);
            
            s1.add(d);
            s2.add(s);

            path.put(s,s1);
            path.put(d,s2);

            cost.put(s+":"+d, c);
            cost.put(d+":"+s, c);
        }
        dfs(1,n,new HashSet<>());
        return ans;
    }
}