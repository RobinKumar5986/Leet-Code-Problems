class Solution {
    int[] dp;
    int dfs(int cur,int[] nums){
        if(cur >= nums.length)
            return 0;
        
        if(dp[cur] != -1)
            return dp[cur];
        
        int rob = nums[cur] + dfs(cur+2,nums);
        int noRob = dfs(cur+1, nums);
        dp[cur] = Math.max(rob,noRob);

        return dp[cur];
    }
    public int rob(int[] nums) {
        dp = new int[nums.length];
        Arrays.fill(dp,-1);
        
        int ans = dfs(0,nums);
        return ans;
    }
}