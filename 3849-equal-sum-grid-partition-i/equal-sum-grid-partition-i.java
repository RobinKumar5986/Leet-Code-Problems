class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        long sum = 0;
        for(int[] arr : grid){
            for(int ele : arr){
                sum += ele;
            }
        }
        if(sum % 2 != 0) return false;
        long req = sum/2;
        // check col
        sum = 0;
        for(int row = 0; row < grid.length; row ++) {
            
            for(int col = 0; col < grid[0].length ; col++){
                sum += grid[row][col];
            }
            if(sum == req)
                return true;
        }
        sum = 0;
        for(int col = 0; col < grid[0].length; col++) {
            
            for(int row = 0; row < grid.length ; row++){
                sum += grid[row][col];
            }
            if(sum == req)
                return true;
        }
        return false;

    }
}