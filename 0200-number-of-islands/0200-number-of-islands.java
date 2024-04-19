class Solution {
    boolean[][] vis;
    void dfs(char[][] grid,int r,int c,int row,int col){
        if(r+1 < row && grid[r+1][c]=='1' && !vis[r+1][c]){
            vis[r+1][c]=true;
            dfs(grid,r+1,c,row,col);
        }
        if(r-1>=0 && grid[r-1][c]=='1' && !vis[r-1][c]){
            vis[r-1][c]=true;
            dfs(grid,r-1,c,row,col);
        }
        if(c+1 < col && grid[r][c+1]=='1' && !vis[r][c+1]){
            vis[r][c+1]=true;
            dfs(grid,r,c+1,row,col);
        }
        if(c-1>=0 && grid[r][c-1]=='1' && !vis[r][c-1]){
            vis[r][c-1]=true;
            dfs(grid,r,c-1,row,col);
        }
    }
    public int numIslands(char[][] grid) {
        vis=new boolean[grid.length][grid[0].length];
        int row=grid.length;
        int col=grid[0].length;
        int count=0;
        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                if(grid[r][c]=='0' || vis[r][c])
                    continue;
                vis[r][c]=true;
                dfs(grid,r,c,row,col);
                count++;
            }
        }
        return count;
    }
}