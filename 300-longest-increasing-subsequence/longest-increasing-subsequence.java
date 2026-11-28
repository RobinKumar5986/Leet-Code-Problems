class Solution {
    int dfs(int ind,int prev,int[] nums,int[][] dp){
        if(ind >= nums.length)
            return 0;
        
        if(dp[ind][prev+1] != -1)
            return dp[ind][prev+1];
        
        //case 1: skip
        int max = dfs(ind+1,prev,nums,dp);

        //case 2: take this one
        if(prev == -1 || nums[ind] > nums[prev]){
            int n = dfs(ind+1,ind,nums,dp) + 1; //+1 to show this ele is included
            max = Math.max(max,n);
        }
        dp[ind][prev+1] = max;
        return max;
    }
    public int lengthOfLIS(int[] nums) {
        int[][] dp = new int[nums.length][nums.length+1];
        for(int[] row : dp)
            Arrays.fill(row,-1);
        return dfs(0,-1,nums,dp);
    }
}