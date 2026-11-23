class Solution {
    int[][] dp;
    // //topdown approach
    // int dfs(int i,int j, int m, int n){
    //     if( i == m-1 && j == n-1)
    //         return 1; // reached the bottom
    //     if(i >= m || j >= n)
    //         return 0; // went out of the grid
    //     if(dp[i][j] != -1)
    //         return dp[i][j];
    //     //tow case i.e we can do forward or bittom
    //     int sum = dfs(i+1,j,m,n) + dfs(i,j+1,m,n);

    //     return dp[i][j] = sum;
    // }
    public int uniquePaths(int m, int n) {
        // dp = new int[m][n];
        // for(int[] row : dp)
        //     Arrays.fill(row,-1);
        
        // return dfs(0,0,m,n);

        //Bottom up approach
        dp = new int[m][n];
        dp[m-1][n-1] = 1;
        for(int i = m-1; i >= 0; i--){
            for(int j= n-1; j >= 0; j--){
                if( i != m-1 || j != n-1){
                    int sum = 0;
                    if(i+1 < m)
                        sum += dp[i+1][j];
                    if(j+1 < n)
                        sum += dp[i][j+1];
                    dp[i][j] = sum;
                }
            }
        }
        return dp[0][0];
    }
}