class Solution {
    public int islandPerimeter(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;

        int ans=0;
        for(int row=0;row<m;row++){
            for(int col=0;col<n;col++){
                if(grid[row][col]!=1)
                    continue;
                if(row-1 < 0 || grid[row-1][col]==0)
                    ans++;
                if(row+1 >= m || grid[row+1][col]==0)
                    ans++;
                if(col-1 < 0 || grid[row][col-1]==0)
                    ans++;
                if(col+1 >= n || grid[row][col+1]==0)
                    ans++;
            }
        }
        return ans;
    }
}