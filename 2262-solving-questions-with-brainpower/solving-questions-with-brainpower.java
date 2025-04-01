class Solution {
    long[] dp;
    long dfs(int[][] q,int ind){
        if(ind >= q.length)
            return 0l;
        if(dp[ind] != 0)
            return dp[ind];

        long skip = dfs(q,ind+1);
        long notSkip =  q[ind][0] + dfs( q,ind+q[ind][1] + 1 );
        dp[ind] = Math.max(skip,notSkip);
        
        return dp[ind];
    }
    public long mostPoints(int[][] q) {
        dp = new long[q.length];
        return dfs(q,0);
    }
}