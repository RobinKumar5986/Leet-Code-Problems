class Solution {
    boolean[][] dp;
    void expand(int i , int j , char[][] grid){
        dp[i][j] = true;

        if(i + 1 < grid.length && !dp[i+1][j] && grid[i+1][j] == '1'){
            expand(i+1,j,grid);
        }

        if(i-1 >= 0  && !dp[i-1][j] && grid[i-1][j] == '1')
            expand(i-1,j,grid);

        if(j + 1 < grid[0].length && !dp[i][j+1] && grid[i][j+1] == '1')
            expand(i,j+1,grid);

        if(j-1 >= 0  && !dp[i][j-1] && grid[i][j-1] == '1')
            expand(i,j-1,grid);
        
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