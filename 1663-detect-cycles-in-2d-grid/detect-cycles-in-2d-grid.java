class Solution {
    boolean[][] vis;
    boolean isLoop = false;
    int len = 0 ;

    void dfs(char[][] grid, int i , int j,int pI,int pJ) {
        // System.out.print("(" + i + ","+ j + ") -> ");
        if(isLoop) return;
        if(vis[i][j]){
            if(len >= 4){
                isLoop = true;
            }
            return;
        }
        len += 1;
        vis[i][j] = true;
       
        char ch = grid[i][j];

        if(i+1 < grid.length){
            if(ch == grid[i+1][j] && !(i+1 == pI && j == pJ))
                dfs(grid,i+1,j,i,j);
        }
        if(j+1 < grid[0].length ){
            if(ch == grid[i][j+1] && !(i== pI && j+1 == pJ) )
                dfs(grid,i,j+1,i,j);
        }
        
        if(i-1 >= 0){
            if(ch == grid[i-1][j] && !(i-1 == pI && j == pJ))
                dfs(grid,i-1,j,i,j);
        }
        if(j-1 >= 0){
            if(ch == grid[i][j-1] && !( i == pI && j-1 == pJ))
                dfs(grid,i,j-1,i,j);
        }

    }
    public boolean containsCycle(char[][] grid) {
        vis = new boolean[grid.length][grid[0].length];

        for(int i = 0 ; i < grid.length; i++){
            for(int j = 0 ; j < grid[0].length; j++){
                if(vis[i][j]) continue;
                len = 0;
                dfs(grid,i,j,-1,-1);
                // System.out.println(len + " ::: " + isLoop);
                if(isLoop)
                    return true;
            }
        }
        return false;
    }
}