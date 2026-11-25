class Solution {
    int[][] dp;
    int dfs(int i,int[] nums,int isHolding){
        if(i >= nums.length)
            return 0;
        if(dp[i][isHolding] != -1)
            return dp[i][isHolding];
        //case 1 leave it
        int max = dfs(i+1,nums,isHolding);
        //buy or sell
        if(isHolding == 0){
            int m2 = dfs(i+1,nums,1) - nums[i];
            max = Math.max(max,m2);
        }else{
            int m3 = dfs(i+2,nums,0) + nums[i];

            max = Math.max(max,m3);
        }
        dp[i][isHolding] = max;
        return max;
    }
    public int maxProfit(int[] prices) {
        dp = new int[prices.length][2];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return dfs(0, prices, 0);
    }
}