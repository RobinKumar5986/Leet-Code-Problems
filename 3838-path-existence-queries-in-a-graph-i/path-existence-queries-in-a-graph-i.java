class Solution {
    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] qr) {
        List<Integer> set = new ArrayList<>();
        int[] map = new int[n];
        set.add(0);
        boolean[] ans = new boolean[qr.length];
        int comp_id = 1;
        for(int i = 0 ; i < n-1; i++) {
            //can reach next ?
            int abs = Math.abs(nums[i] - nums[i+1]);
            if(abs  <= maxDiff) {
                set.add(i+1);
            }else{
                //first fill the map then reset the set
                for(int ele : set){
                    map[ele] = comp_id;
                }
                comp_id++;
                set = new ArrayList<>(); // new hash set
                set.add(i+1);
            }
        }
        comp_id++;
        for (int ele : set) {
            map[ele] = comp_id;
        }
        int ind = 0;
        for(int[] ele : qr){
            int src = ele[0];
            int dst = ele[1];
            if(map[src] == map[dst]){
                ans[ind++] = true;
            }else{
                ans[ind++] = false;
            }
        }
        return ans;
    }
}