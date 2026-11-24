class Solution {
    void expand(int i, int j,boolean[][] dp, char[][] grid) {
        if(i >= grid.length || j >= grid[0].length || i < 0 || j < 0)
            return;
        if(grid[i][j] == '0')
            return;
        if(dp[i][j])
            return;
        dp[i][j] = true;

        expand(i+1,j,dp,grid);
        expand(i-1,j,dp,grid);
        expand(i,j+1,dp,grid);
        expand(i,j-1,dp,grid);

    }
    public int numIslands(char[][] grid) {
        int ans = 0; 
        boolean[][] dp = new boolean[grid.length][grid[0].length];

        for(int i = 0 ; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == '0' || dp[i][j])
                    continue;
                ans++;
                expand(i,j,dp,grid);
            }
        }
        return ans;
    }
}