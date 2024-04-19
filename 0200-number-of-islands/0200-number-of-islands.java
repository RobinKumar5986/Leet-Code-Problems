class Solution {
    void dfs(char[][] grid,int r,int c,int row,int col){
        if(r<0 || c<0 || r>=row || c>=col)
            return;
        if(grid[r][c]!='1')
            return;
        grid[r][c]='9';
        dfs(grid,r+1,c,row,col);
        dfs(grid,r-1,c,row,col);
        dfs(grid,r,c+1,row,col);
        dfs(grid,r,c-1,row,col);
        
    }
    public int numIslands(char[][] grid) {

        int row=grid.length;
        int col=grid[0].length;
        int count=0;
        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                if(grid[r][c]=='1' ){
                    dfs(grid,r,c,row,col);
                    count++;
                }
            }
        }
        return count;
    }
}