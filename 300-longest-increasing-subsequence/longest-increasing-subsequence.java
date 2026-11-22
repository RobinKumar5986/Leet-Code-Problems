class Solution {
    int[][] dp;
    int dfs(int ind,int prev,int[] nums){
        if(ind >= nums.length)
            return 0;
        if(dp[ind][prev+1] != -1)
            return dp[ind][prev+1];

        //case 1: skip the element
        int l1 = dfs(ind+1,prev,nums);

        //case 2: take the emelment
        int l2 = 0;
        if(prev == -1 || nums[prev] < nums[ind]) {
            l2 = dfs(ind+1,ind,nums) + 1; //+1 to indicate we have added this number
        }
        int max = Math.max(l1,l2); // getting the max len possible out of two
        dp[ind][prev+1] = max;
        return dp[ind][prev+1];
    }
    public int lengthOfLIS(int[] nums) {
        dp = new int[nums.length][nums.length+1];
        for(int[] row : dp)
            Arrays.fill(row,-1);
        
        return dfs(0,-1,nums);
    }
}