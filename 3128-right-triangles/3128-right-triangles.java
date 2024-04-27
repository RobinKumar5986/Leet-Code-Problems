class Solution {
    public long numberOfRightTriangles(int[][] grid) {
        int row[]=new int[grid.length];
        int col[]=new int[grid[0].length];
        
        for(int r=0;r<grid.length;r++){
            for(int c=0;c<grid[0].length;c++){
                if(grid[r][c]==1){
                    row[r]++;
                    col[c]++;
                }
            }
        }
        long ans=0;
        for(int r=0;r<grid.length;r++){
            for(int c=0;c<grid[0].length;c++){
                if(grid[r][c]!=1)
                    continue;
                if(row[r]==1 || col[c]==1)
                    continue;
                if(row[r]-1>1 && col[c]-1>1)
                {
                        ans+=(row[r]-1) * (col[c]-1);
                }
                else if(row[r]-1>1 || col[c]-1>1)
                {
                    if(row[r]-1>1)
                        ans+=row[r]-1;
                    if(col[c]-1>1)
                        ans+=col[c]-1;
                }else{
                    ans+=Math.max(row[r]-1,col[c]-1);
                }
                
            }
        }
        return ans;
    }
}