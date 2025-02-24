class Solution {

    public boolean validPath(int n, int[][] edges, int src, int dst) {
        if(src == dst)
            return true;
        Map<Integer,Set<Integer>> map = new HashMap<>();
        for(int[] ele : edges){
            if(!map.containsKey(ele[0])){
                map.put(ele[0],new HashSet<>());
            }
            Set<Integer> set1 = map.get(ele[0]);
            set1.add(ele[1]);
            map.put(ele[0],set1);

            if(!map.containsKey(ele[1])){
                map.put(ele[1],new HashSet<>());
            }
            Set<Integer> set2 = map.get(ele[1]);
            set2.add(ele[0]);
            map.put(ele[1],set2);
        }
        Queue<Integer> stk = new LinkedList<>();
        Set<Integer> neb = map.get(src);
        for(int ele : neb){
            stk.add(ele);
        }
        Set<Integer> vis = new HashSet<>();
        while(!stk.isEmpty()){
            int sz = stk.size();
            for(int i = 0 ; i < sz ; i ++){
                int node = stk.remove();
                if(node == dst){
                    return true;
                }
                if(!vis.contains(node)){
                    Set<Integer> nn = map.get(node);
                    for(int ele : nn){
                        if(!vis.contains(ele)){
                            stk.offer(ele);
                        }
                    }
                }
                vis.add(node);
            }
        }
        return false;
    }
}