class Solution {
    int[][] dp;

    int dfs(int i, int[] prices, int holding) {
        if (i >= prices.length) {
            return 0;
        }

        if (dp[i][holding] != -1) {
            return dp[i][holding];
        }

        //leave it
        int best = dfs(i + 1, prices, holding);

        if (holding == 0) {
            //buy
            int buy = dfs(i + 1, prices, 1) - prices[i];
            best = Math.max(best, buy);
        } else {
            //sell, then cooldown on day i+1
            int sell = dfs(i + 2, prices, 0) + prices[i];
            best = Math.max(best, sell);
        }

        dp[i][holding] = best;

        return best;
    }

    public int maxProfit(int[] prices) {
        dp = new int[prices.length][2];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return dfs(0, prices, 0);
    }
}