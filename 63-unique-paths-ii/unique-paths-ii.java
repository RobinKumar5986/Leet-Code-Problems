class Solution {
    int[][] dp;
    int dfs(int i,int j,int[][] grid,int m, int n){
        if( i == m-1 && j == n-1)
            return 1;
        if(i >= m || j >= n)
            return 0;
        if(grid[i][j] == 1)
            return 0; //path not available
        if(dp[i][j] != -1)
            return dp[i][j];
        
        int res = dfs(i+1,j,grid,m,n) + dfs(i,j+1,grid,m,n);

        return dp[i][j] = res;        
    }
    public int uniquePathsWithObstacles(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        if(grid[m-1][n-1] == 1)
            return 0;

        dp = new int[m][n];
        for(int[] row : dp)
            Arrays.fill(row,-1);

        return dfs(0,0,grid,m,n);
    }
}