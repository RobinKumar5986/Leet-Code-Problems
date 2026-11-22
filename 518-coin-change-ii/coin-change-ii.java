class Solution {
    int[][] dp;
    int dfs(int rem,int ind, int[] coins){
        if(rem == 0)
            return 1;
        if(rem < 0)
            return 0;
        if(dp[ind][rem] != -1)
            return dp[ind][rem];
        int sum = 0;
        for(int i = ind; i < coins.length; i++){
            int ways = dfs(rem-coins[i],i,coins);
            sum += ways;
        }
        dp[ind][rem] = sum;
        return dp[ind][rem];
    }
    public int change(int amount, int[] coins) {
        dp = new int[coins.length][amount+1];
        for(int[] row : dp)
            Arrays.fill(row,-1);
        return dfs(amount,0,coins);
    }
}