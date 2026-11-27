class Solution {
    int[][] dp;
    int pad = 1000;
    int dfs(int ind,int sum,int target,int[] nums){
        if(ind == nums.length){
            if(sum == target)
                return 1;
            return 0;
        }
        if(dp[ind][sum + pad] != -1){
            return dp[ind][sum + pad];
        }
        
        //two choices 1.+ve 2.-ve
        //case 1: +ve
        int s1 = dfs(ind+1,sum + nums[ind],target,nums);
        //case 2: -ve
        int s2 = dfs(ind+1,sum - nums[ind],target,nums);

        int res = s1 + s2;
        dp[ind][sum+pad] = res;

        return dp[ind][sum + pad];
    }
    public int findTargetSumWays(int[] nums, int target) {
        dp = new int[nums.length][2000+1];
        for(int[] row : dp)
            Arrays.fill(row,-1);
        return dfs(0,0,target,nums);
    }
}