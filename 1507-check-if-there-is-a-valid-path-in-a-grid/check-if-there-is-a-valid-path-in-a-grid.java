class Solution {
    boolean[][] vis;

    boolean dfs(int[][] grid, int i, int j,int dir) {
        if(vis[i][j]) return false;

        if(i == grid.length-1 && j == grid[0].length-1){
            return true;
        }
        if(i >= grid.length || j >= grid[0].length){
            return false;
        }
        vis[i][j] = true;
        int str = grid[i][j];
        if(str == 1){
            if(dir == 2) {
                if(j+1 >= grid[0].length) return false;
                int nxt = grid[i][j+1];
                if(nxt == 2 || nxt == 4 || nxt == 6) return false;

                if(nxt == 1) return dfs(grid,i,j+1,2);
                if(nxt == 3) return dfs(grid,i,j+1,3);
                if(nxt == 5) return dfs(grid,i,j+1,1);
            }else{ //dir 4
                if(j-1 < 0) return false;
                int nxt = grid[i][j-1];
                if(nxt == 2 || nxt == 3 || nxt == 5) return false;

                if(nxt == 1) return dfs(grid,i,j-1,4);
                if(nxt == 4) return dfs(grid,i,j-1,3);
                if(nxt == 6) return dfs(grid,i,j-1,1);
            }
            
        }else if(str == 2){
            if(dir == 3) { 
                if(i+1 >= grid.length) return false;
                int nxt = grid[i+1][j];
                if(nxt == 1 || nxt == 3 || nxt == 4) return false;

                if(nxt == 2) return dfs(grid,i+1,j,3);
                if(nxt == 5) return dfs(grid,i+1,j,4);
                if(nxt == 6) return dfs(grid,i+1,j,2);
            }else{ // dir 1 
                if(i-1 < 0) return false;
                int nxt = grid[i-1][j];
                if(nxt == 1 || nxt == 5 || nxt == 6) return false;

                if(nxt == 2) return dfs(grid,i-1,j,1);
                if(nxt == 3) return dfs(grid,i-1,j,4);
                if(nxt == 4) return dfs(grid,i-1,j,2);
            }
        }else if(str == 3){
            if(dir == 3) {
                if(i+1 >= grid.length) return false;
                int nxt = grid[i+1][j];
                if(nxt == 1 || nxt == 3 || nxt == 4) return false;

                if(nxt == 2) return dfs(grid,i+1,j,3);
                if(nxt == 5) return dfs(grid,i+1,j,4);
                if(nxt == 6) return dfs(grid,i+1,j,2);
            }else{ //dir 4
                if(j-1 < 0) return false;
                int nxt = grid[i][j-1];
                if(nxt == 2 || nxt == 3 || nxt == 5) return false;

                if(nxt == 1) return dfs(grid,i,j-1,4);
                if(nxt == 4) return dfs(grid,i,j-1,3);
                if(nxt == 6) return dfs(grid,i,j-1,1);
            }
        }else if(str == 4){
            if(dir == 3) {
                if(i+1 >= grid.length) return false;
                int nxt = grid[i+1][j];
                if(nxt == 1 || nxt == 3 || nxt == 4) return false;

                if(nxt == 2) return dfs(grid,i+1,j,3);
                if(nxt == 5) return dfs(grid,i+1,j,4);
                if(nxt == 6) return dfs(grid,i+1,j,2);
            }else{ // dir 2
                if(j+1 >= grid[0].length) return false;
                int nxt = grid[i][j+1];
                if(nxt == 2 || nxt == 4 || nxt == 6) return false;

                if(nxt == 1) return dfs(grid,i,j+1,2);
                if(nxt == 3) return dfs(grid,i,j+1,3);
                if(nxt == 5) return dfs(grid,i,j+1,1);
            }

        }else if(str == 5){
            if(dir == 1){
                if(i-1 < 0) return false;
                int nxt = grid[i-1][j];
                if(nxt == 1 || nxt == 5 || nxt == 6) return false;

                if(nxt == 2) return dfs(grid,i-1,j,1);
                if(nxt == 3) return dfs(grid,i-1,j,4);
                if(nxt == 4) return dfs(grid,i-1,j,2);
            }else{ // dir 4
                if(j-1 < 0) return false;
                int nxt = grid[i][j-1];
                if(nxt == 2 || nxt == 3 || nxt == 5) return false;

                if(nxt == 1) return dfs(grid,i,j-1,4);
                if(nxt == 4) return dfs(grid,i,j-1,3);
                if(nxt == 6) return dfs(grid,i,j-1,1);
            }
        }else if(str == 6){
            if(dir == 1){
                if(i-1 < 0) return false;
                int nxt = grid[i-1][j];
                if(nxt == 1 || nxt == 5 || nxt == 6) return false;

                if(nxt == 2) return dfs(grid,i-1,j,1);
                if(nxt == 3) return dfs(grid,i-1,j,4);
                if(nxt == 4) return dfs(grid,i-1,j,2);
            }else{ //dir 2
                if(j+1 >= grid[0].length) return false;
                int nxt = grid[i][j+1];
                if(nxt == 2 || nxt == 4 || nxt == 6) return false;

                if(nxt == 1) return dfs(grid,i,j+1,2);
                if(nxt == 3) return dfs(grid,i,j+1,3);
                if(nxt == 5) return dfs(grid,i,j+1,1);
            }
        }
        return false; // this is dummy if the grid is valid then this case will neve occurs.
    }
    public boolean hasValidPath(int[][] grid) {
        //Hope there is no loop in the path Fuck it does have loops.
        int str = grid[0][0];
        vis = new boolean[grid.length][grid[0].length];

        if(str == 1) {
            return dfs(grid,0,0,2);
        }else if (str == 2){
            return dfs(grid,0,0,3);
        }else if (str == 3){
            return dfs(grid,0,0,3);
        }else if (str == 4){
            boolean b1 = dfs(grid,0,0,2);
            vis = new boolean[grid.length][grid[0].length];
            boolean b2 =  dfs(grid,0,0,3);
            return b1 || b2;
        }else if (str == 5){
            return false;
        }else if(str == 6){
            return dfs(grid,0,0,2);
        }
        return false;

    }
}