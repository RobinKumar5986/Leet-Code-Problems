class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        
        for(int rem = 1 ; rem <= amount; rem++){
            dp[rem] = Integer.MAX_VALUE;
            for(int c : coins) {
                if(rem - c >= 0 && dp[rem - c] != Integer.MAX_VALUE){
                    dp[rem] = Math.min(dp[rem],dp[rem - c] +1);
                }
            }
        }
        if (dp[amount] == Integer.MAX_VALUE)
            return -1;
        return dp[amount];
    }
}