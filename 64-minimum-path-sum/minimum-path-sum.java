class Solution {

    int dfs(int i,int j,int[][] grid,int[][] dp){
        if(i == grid.length-1 && j == grid[0].length-1)
            return grid[i][j];
        if(i >= grid.length || j >= grid[0].length)
            return Integer.MAX_VALUE;
        if(dp[i][j] != -1)
            return dp[i][j];
        //Two path forward or down
        int n1 = dfs(i+1,j,grid,dp);
        int n2 = dfs(i,j+1,grid,dp);

        int min = Integer.MAX_VALUE;
        if(n1 != Integer.MAX_VALUE){
            min = n1;
        }
        if(n2 != Integer.MAX_VALUE){
            min = Math.min(min,n2);
        }
        if(min != Integer.MAX_VALUE)
            min += grid[i][j];
        dp[i][j] = min;
        return min;

    }
    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        for(int[] row : dp)
            Arrays.fill(row,-1);
        return dfs(0,0,grid,dp);
    }
}