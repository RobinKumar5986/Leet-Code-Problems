class Solution {
    int[] dp;
    int clim(int cur, int n){
        if(cur >= n){
            return 1;
        }
        if(dp[cur] != 0){
            return dp[cur];
        }
        //climbing 1 step
        int one = clim(cur+1,n);

        //climbing 2 step
        int two = clim(cur+2,n);
        dp[cur] = one + two;
        return dp[cur];
    }
    public int climbStairs(int n) {
        dp = new int[n+1];
        return clim(1,n);
    }
}