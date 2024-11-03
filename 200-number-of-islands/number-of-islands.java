class Solution {
    boolean[][] dp;
    void expand(int i , int j , char[][] grid){
        if (
        i >= grid.length 
        || i < 0 
        || j >= grid[0].length || j < 0 
        || grid[i][j] == '0' 
        || dp[i][j]
        ) {
            return;
        }
        
        dp[i][j] = true;
        expand(i + 1, j, grid);
        expand(i - 1, j, grid);
        expand(i, j + 1, grid);
        expand(i, j - 1, grid);
    }
    public int numIslands(char[][] grid) {
        dp = new boolean[grid.length][grid[0].length];
        int ans = 0;
        for(int i = 0 ; i < grid.length ; i++){
            for(int j = 0 ; j < grid[0].length; j++ ){
                if(grid[i][j] == '0' || dp[i][j])
                    continue;
                expand(i,j,grid);
                ans++;
            }
        }
        return ans;
    }
}