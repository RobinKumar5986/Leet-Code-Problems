class Solution {
    public int islandPerimeter(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int para=0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    if(i-1<0)
                        para++;
                    if(i+1>=m)
                        para++;
                    if(j-1<0)
                        para++;
                    if(j+1>=n)
                        para++;
                    if(i-1 >=0 && grid[i-1][j]==0)
                        para++;
                    if(i+1 <m && grid[i+1][j]==0)
                        para++;
                    if(j-1>=0 && grid[i][j-1]==0)
                        para++;
                    if(j+1 <n && grid[i][j+1]==0)
                        para++;
                }
            }
        }
        return para;
    }
}