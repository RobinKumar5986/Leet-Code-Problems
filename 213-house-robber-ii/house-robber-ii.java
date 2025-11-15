class Solution {
    int[] dp;
    int dfs(int ind,int[] nums,int max) {
        if(ind >= max){
            return 0;
        }
        if(dp[ind] != -1)
            return dp[ind];
        //rob
        int rob = nums[ind] + dfs(ind+2,nums,max);
        int not = dfs(ind+1,nums,max);
        dp[ind] = Math.max(rob,not);
        return dp[ind];
    }
    public int rob(int[] nums) {
        if(nums.length == 1)
            return nums[0];
        dp = new int[101];
        Arrays.fill(dp,-1);
        int r1 = dfs(1,nums,nums.length);
        
        Arrays.fill(dp,-1);
        int r2 = dfs(0,nums,nums.length-1);
        
        return r1 > r2 ? r1 : r2;
    }
}