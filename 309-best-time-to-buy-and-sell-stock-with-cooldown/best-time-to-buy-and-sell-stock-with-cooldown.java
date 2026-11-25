class Solution {
    int[][] dp;
    int dfs(int i,int[] prices,int prev){
        if(i >= prices.length){
            return 0;
        }
        if(dp[i][prev+1] != -1)
            return dp[i][prev+1];
    
        //leave it
        int p1 = dfs(i+1,prices,prev);
        //buy
        int p2 = dfs(i+1,prices,i);
        
        //sell
        int p3 = 0;
        if(prev != -1){
            int pr = prices[i] - prices[prev];
            if(pr >= 0){
                p3 = dfs(i+2,prices,-1) + pr;
            }
        }
        int max = Math.max(p1,Math.max(p2,p3));
       
        dp[i][prev+1] = max;
        
        return max;
    }
    public int maxProfit(int[] prices) {
        dp = new int[prices.length][prices.length+1];

        for(int[] row : dp)
            Arrays.fill(row,-1);
        return dfs(0,prices,-1);
    }
}