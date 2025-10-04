class Solution {
    int[] dp;
    int climb(int cur, int[] cost){

        if(cur >= cost.length) return 0; //reached the top

        if(dp[cur] != -1) return dp[cur];

        int one = cost[cur] + climb(cur+1, cost);
        int two = cost[cur] + climb(cur+2, cost);

        dp[cur] = Math.min(one,two);

        return dp[cur];
    }
    public int minCostClimbingStairs(int[] cost) {
        dp = new int[cost.length];

        Arrays.fill(dp, -1);

        int one = climb(0, cost);
        int two = climb(1, cost);

        return Math.min(one,two);
    }
}