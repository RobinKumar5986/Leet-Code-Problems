class Solution {
    boolean[][] vis;
    void expand(char[][] grid,int row,int col){
        
        vis[row][col] = true;
        //expandin up
        if(row - 1 >= 0 && grid[row-1][col] == '1' && !vis[row-1][col]){
            expand(grid,row-1,col);
        }
        //expanding down
        if(row + 1 < grid.length && grid[row+1][col] == '1' && !vis[row+1][col]){
            expand(grid,row+1,col);
        }
        //expanding right
        if(col + 1 < grid[0].length && grid[row][col+1] == '1' && !vis[row][col+1]){
            expand(grid,row,col+1);
        }
        //expanding left
        if(col - 1 >= 0 && grid[row][col-1] == '1' && !vis[row][col-1]){
            expand(grid,row,col-1);
        }
    }
    public int numIslands(char[][] grid) {
        int ans = 0;
        vis = new boolean[grid.length][grid[0].length];
        for(int i = 0 ; i < grid.length; i++){
            for(int j = 0 ; j < grid[0].length; j++){
                if(!vis[i][j] && grid[i][j] == '1'){
                    expand(grid,i,j);
                    ans++;
                }
            }
        }

        return ans;
    }
}