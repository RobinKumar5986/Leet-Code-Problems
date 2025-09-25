class Solution {
    int last;
    Map<String,Integer> dp = new HashMap<>();

    int dfs(int ind, int lev,List<List<Integer>> tri){
        if (lev == last) {
            return 0;
        }

        String id = ind + "," + lev;
        if(dp.containsKey(id)){
            return dp.get(id);
        }

        List<Integer> v = tri.get(lev);
        int n1 = Integer.MAX_VALUE;
        int n2 = Integer.MAX_VALUE;
       
        n1 = dfs(ind,lev+1,tri);
        n2 = dfs(ind + 1 , lev+1,tri);

        int min = tri.get(lev).get(ind) + Math.min(n1, n2);
        dp.put(id, min);
        
        return min;
    }
    public int minimumTotal(List<List<Integer>> tri) {
        last =  tri.size();
        return dfs(0,0, tri);
    }
}