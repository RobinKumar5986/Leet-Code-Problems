class Solution {
    int[][] dp;
    // int dfs(int i,int j,int[][] grid,int m, int n){
    //     if( i == m-1 && j == n-1)
    //         return 1;
    //     if(i >= m || j >= n)
    //         return 0;
    //     if(grid[i][j] == 1)
    //         return 0; //path not available
    //     if(dp[i][j] != -1)
    //         return dp[i][j];
        
    //     int res = dfs(i+1,j,grid,m,n) + dfs(i,j+1,grid,m,n);

    //     return dp[i][j] = res;        
    // }
    public int uniquePathsWithObstacles(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        if(grid[m-1][n-1] == 1 || grid[0][0] == 1)
            return 0;

        dp = new int[m][n];
        // for(int[] row : dp)
        //     Arrays.fill(row,-1);

        // return dfs(0,0,grid,m,n);

        dp[m-1][n-1] = 1;
        for(int i = m-1; i >= 0; i--){
            for(int j = n-1; j >= 0; j--){
                if( i != m-1 || j != n-1){
                    int sum = 0;
                    if(i+1 < m && grid[i+1][j] != 1)
                        sum += dp[i+1][j];
                    if(j+1 < n && grid[i][j+1] != 1)
                        sum += dp[i][j+1];
                    dp[i][j] = sum;
                }
            }
        }
        return dp[0][0];
    
    }
}