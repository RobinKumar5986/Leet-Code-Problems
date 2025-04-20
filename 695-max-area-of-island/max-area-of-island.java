class Solution {
    int ans = 0;
    int area = 0;
    void expand(int[][] grid,int row , int col){
        if(grid[row][col] == 999)
            return;
        area += 1;
        grid[row][col] = 999;
        ans = Math.max(ans,area);

        //up
        if(row - 1 >= 0 && grid[row - 1][col] == 1)
            expand(grid,row-1,col);
        //down
        if(row + 1 < grid.length && grid[row + 1][col] == 1)
            expand(grid,row+1,col);
        //right
        if(col + 1 < grid[0].length && grid[row][col + 1] == 1)
            expand(grid,row,col+1);
        //left
        if(col - 1 >= 0 && grid[row][col-1] == 1)
            expand(grid,row,col-1);
    }
    public int maxAreaOfIsland(int[][] grid) {
        for(int row = 0; row < grid.length ; row++){
            for(int col = 0 ; col < grid[0].length ; col++){
                if(grid[row][col] == 1){
                    expand(grid,row,col);
                    area = 0;
                }
            }
        }

        return ans;
    }
}