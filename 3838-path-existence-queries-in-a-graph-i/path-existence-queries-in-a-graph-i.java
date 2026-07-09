class Solution {
    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] qr) {
        Map<Integer,Set<Integer>>  nodeGraph = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        set.add(0);
        boolean[] ans = new boolean[qr.length];
        for(int i = 0 ; i < n-1; i++) {
            //can reach next ?
            int abs = Math.abs(nums[i] - nums[i+1]);
            if(abs  <= maxDiff) {
                set.add(i+1);
            }else{
                //first fill the map then reset the set
                for(int ele : set){
                    nodeGraph.put(ele,set);
                }
                set = new HashSet<>(); // new hash set
                set.add(i + 1);
            }
        }
        for (int ele : set) {
            nodeGraph.put(ele, set);
        }
        int ind = 0;
        for(int[] ele : qr){
            int src = ele[0];
            int dst = ele[1];
            Set<Integer> path = nodeGraph.get(src);
            if(!path.isEmpty() && path.contains(dst)){
                ans[ind++] = true;
            }else{
                ans[ind++] = false;
            }
        }
        return ans;
    }
}