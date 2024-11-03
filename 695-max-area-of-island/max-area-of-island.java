class Solution {
    int expand(int r,int c, int rlen, int clen, int[][] grid){
        if(r>= rlen || c >= clen || r<0 || c < 0 || grid[r][c] == 0 || grid[r][c] == -1)
            return 0;
        grid[r][c] = -1;
        return 
        expand(r+1,c,rlen,clen,grid) + 
        expand(r-1,c,rlen,clen,grid) + 
        expand(r,c+1,rlen,clen,grid) +
        expand(r,c-1,rlen,clen,grid) + 1;

    }
    public int maxAreaOfIsland(int[][] grid) {
        int ans = 0;
        int rLen = grid.length;
        int cLen = grid[0].length;
        for(int r = 0 ; r < rLen ; r++){
            for(int c = 0 ; c < cLen ; c++){
                if(grid[r][c] == 0 || grid[r][c] == -1)
                    continue;
                ans = Math.max(ans , expand(r,c,rLen,cLen,grid) );
            }
        }
        return ans;
    }
}