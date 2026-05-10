class Solution {
    int[] dp;
    int dfs(int ind, int[] nums, int target){
        if(ind >= nums.length-1)
            return 0;
        if(dp[ind] != Integer.MIN_VALUE)
            return dp[ind];
        
        int max = -1;
        for(int i = ind+1 ; i <= nums.length-1; i++){
            int val = nums[i] - nums[ind];
            if(-target <= val && val <= target){
                int tJ = dfs(i,nums,target);
                if(tJ != -1) {
                    max = Math.max(max ,tJ + 1);
                }
            }
        }
        dp[ind] = max;

        return max;
    }
    public int maximumJumps(int[] nums, int target) {
        if(nums.length <= 1)
            return 0;
        dp = new int[nums.length];
        Arrays.fill(dp, Integer.MIN_VALUE);
        int result = dfs(0,nums,target);
        if(result == Integer.MIN_VALUE) return -1;
        
        return result; 
    }
}