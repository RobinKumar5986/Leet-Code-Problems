class Solution {
    int[] dp;
    int dfs(int step,int n){
        if (step == n) return 1;
        if (step > n) return 0;
        if(dp[step] != -1)
            return dp[step];
        
        int val = dfs(step + 1,n) + dfs(step + 2,n);
        dp[step] = val;
        return dp[step];
    }
    public int climbStairs(int n) {
        dp = new int[n+3];
        Arrays.fill(dp,-1);
        return dfs(0,n);
    }
}