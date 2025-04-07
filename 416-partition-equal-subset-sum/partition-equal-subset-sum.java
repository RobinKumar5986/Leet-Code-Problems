class Solution {
    int req = 0;
    Boolean[][] dp;
    boolean dfs(int[] nums, int ind,int sum){
        if (sum > req) return false;
        if(ind >= nums.length)
            return false;
        if(sum == req)
            return true;
        if (dp[ind][sum] != null) 
            return dp[ind][sum];
        boolean res =  dfs(nums,ind+1,sum) || dfs(nums,ind+1,sum + nums[ind]);
        dp[ind][sum] = res;

        return dp[ind][sum];
    }
    public boolean canPartition(int[] nums) {
        for(int ele : nums)
            req += ele;
        if(req % 2 != 0)
            return false;
        req = req/2;
        dp = new Boolean[nums.length][req + 1]; 
        return dfs(nums,0,0);
    }
}