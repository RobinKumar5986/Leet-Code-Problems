class Solution {
    int[][] dp;
    int INF;
    int dfs(int ind, int rem, int[] coins){
        if(rem == 0)
            return 0;
        if(rem < 0)
            return INF;
        if(dp[ind][rem] != -1)
            return dp[ind][rem];
        int min = INF;
        for(int i = ind; i < coins.length; i++){
            int val = dfs(i,rem - coins[i],coins);
            if(val != INF){
                min = Math.min(min,val + 1); //calming coins[i] used;
            }
        }
        dp[ind][rem] = min;
        return min;
    }
    public int coinChange(int[] coins, int amount) {
        INF = amount + 1;
        dp = new int[coins.length][amount+1];
        for(int[] row : dp)
            Arrays.fill(row,-1);
        int ans =  dfs(0,amount,coins);
        if(ans == INF)
            return -1;
        return ans;

    }
}