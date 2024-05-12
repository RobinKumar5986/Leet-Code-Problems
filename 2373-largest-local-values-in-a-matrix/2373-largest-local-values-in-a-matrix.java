class Solution {
    int findMax(int row,int col,int[][] grid){
        int max=Integer.MIN_VALUE;
        for(int i=row;i<row+3;i++){
            for(int j=col;j<col+3;j++){
                max = Math.max(grid[i][j], max);
            }
        }
        return max;
    }
    public int[][] largestLocal(int[][] grid) {
        int[][] ans=new int[grid.length-2][grid[0].length-2];
        for(int r=0;r<grid.length-2;r++){
            for(int c=0;c<grid[0].length-2;c++){
                int max=findMax(r,c,grid);
                ans[r][c]=max;
            }
        }
        return ans;
    }
}