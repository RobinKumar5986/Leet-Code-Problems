class Solution {
    int ans = Integer.MAX_VALUE;
    int[] dp;

    int getMin(int cur, int n , int[] costs){
        if(cur == n) return 0;
        
        if(dp[cur] != -1) return dp[cur];

        int s1 = costs[cur] + 1 + getMin(cur+1,n,costs);
        int s2 = Integer.MAX_VALUE;
        int s3 = Integer.MAX_VALUE;
        
        if(cur+2 <= n) s2 = costs[cur+1] + 4 + getMin(cur+2,n,costs);
        if(cur+3 <= n) s3 = costs[cur+2] + 9 + getMin(cur+3,n,costs);


        int min = Math.min(s1,Math.min(s2,s3));
        dp[cur] = min;

        return dp[cur];
    }
    public int climbStairs(int n, int[] costs) {
        dp = new int[n+1];
        Arrays.fill(dp, -1);
        return getMin(0, n, costs);

    }
}