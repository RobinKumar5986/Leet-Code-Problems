class Solution {
    public long findScore(int[] nums) {
        long ans = 0;
        int[][] pair = new int[nums.length][2];
        for(int i = 0 ; i < nums.length ; i++){
            pair[i][0] = nums[i];
            pair[i][1] = i;
        }
        Arrays.sort(pair , (a,b) -> {
            if(a[0] != b[0]){
                return Integer.compare(a[0],b[0]);
            }
            return Integer.compare(a[1], b[1]);
        });

        Set<Integer> vis = new HashSet<>();
        for(int i = 0 ; i < nums.length; i++){
            if(!vis.contains(pair[i][1])){
                ans+= pair[i][0];
                vis.add(pair[i][1]);
                vis.add(pair[i][1] + 1);
                vis.add(pair[i][1]-1);
            }
        }
        
        
        return ans;
    }
}