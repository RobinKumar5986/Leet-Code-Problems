class Solution {
    long[][] dp;
    long dfs(int[] coin,int rem,int ind){
        if(rem == 0)
            return 0;
        if(rem < 0)
            return Long.MAX_VALUE;
        if(dp[ind][rem] != -1)
            return dp[ind][rem];
        long minStep = Long.MAX_VALUE;
        for(int i = ind; i < coin.length;i++){
            long st = dfs(coin,rem-coin[i],i);
            if(st != Long.MAX_VALUE)
                minStep = Math.min(minStep,st+1); //only check if we ever able to reach the requide
        }
        dp[ind][rem] = minStep;
        return minStep;
    }

    public int coinChange(int[] coins, int amount) {
        
        dp = new long[coins.length][amount+1];
        for (long[] row : dp)
            Arrays.fill(row, -1);
        long ans = dfs(coins,amount,0);
        if(ans == Long.MAX_VALUE){
            return -1;
        }
        return (int)ans;
    }
}