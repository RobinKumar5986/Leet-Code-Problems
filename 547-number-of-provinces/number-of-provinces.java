class Solution {
    void expand(int key, boolean[] vis, Map<Integer,Set<Integer>> path){
        vis[key] = true;
        Set<Integer> set = path.get(key);
        for(int ele : set){
            if(!vis[ele])
                expand(ele,vis,path);
        }
    }
    public int findCircleNum(int[][] con) {
        Map<Integer,Set<Integer>> map = new HashMap<>();
        int n = con.length;
        boolean[] vis = new boolean[n];

        for(int i = 0 ; i < n; i++){
            for(int j = 0; j < n; j++){
                if(con[i][j] == 0)
                    continue;
                if(!map.containsKey(i))
                    map.put(i,new HashSet<>());
                if(!map.containsKey(j))
                    map.put(j,new HashSet<>());
                
                Set<Integer> s1 = map.get(i);
                Set<Integer> s2 = map.get(j);

                s1.add(j);
                s2.add(i);

                map.put(i,s1);
                map.put(j,s2);
            }
        }
        int ans = 0;
        for(Map.Entry<Integer,Set<Integer>> ele : map.entrySet()){
            int key = ele.getKey();
            if(vis[key])
                continue;
            ans++;
            expand(key,vis,map);
        }
        
        return ans;

    }
}