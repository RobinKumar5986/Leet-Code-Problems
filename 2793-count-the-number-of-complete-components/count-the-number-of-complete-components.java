class Solution {
    Map<Integer,Set<Integer>> map = new HashMap<>();
    Set<Integer> vis = new HashSet<>();
    int ans = 0;
    public int countCompleteComponents(int n, int[][] edg) {
        map(edg);
        for (Map.Entry<Integer, Set<Integer>> entry : map.entrySet()) {
            int k = entry.getKey();
            Set<Integer> v = entry.getValue();
            if (vis.contains(k)) {
                continue; 
            }
            
            boolean flag = true;
            vis.add(k);
            
            for (int ele : v) {
                vis.add(ele);
                if (!map.get(ele).equals(v)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                ans++;
            }
        }
        ans += n - map.size();
        return ans; 
    }

    void map(int[][] edg){
        for(int[] ele : edg){
            if(!map.containsKey(ele[0]))
                map.put(ele[0],new HashSet<>());
            if(!map.containsKey(ele[1]))
                map.put(ele[1],new HashSet<>());
            //a -> b
            Set<Integer> lst = map.get(ele[0]);
            lst.add(ele[1]);
            lst.add(ele[0]);
            map.put(ele[0],lst);

            //b -> a
            lst = map.get(ele[1]);
            lst.add(ele[0]);
            lst.add(ele[1]);
            map.put(ele[1],lst);
        }
    }
}