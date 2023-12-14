class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[] rSum=new int[m];
        int[] cSum=new int[n];
        for(int row=0 ; row < m ; row++ ){
            for(int col=0 ; col < n ; col++ ){
                if(grid[row][col]==1){
                    rSum[row]++;
                    cSum[col]++;
                }
            }
        }
        for(int row=0; row<m ; row++){
            for(int col=0; col<n ; col++){
                int zRow=m-rSum[row];
                int zCol=n-cSum[col];
                int diff= rSum[row] + cSum[col] - zRow - zCol;   
                grid[row][col]=diff;
            }
            System.out.println();
        }
        
        return grid;
    }
}