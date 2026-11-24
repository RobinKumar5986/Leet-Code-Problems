class Solution {
    void expand(int i, int j,int t,int[][] time, int[][] grid){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length )
            return;
        if(grid[i][j] == 0)
            return;
        if(time[i][j] <= t)
            return;
        time[i][j] = t;
        expand(i+1,j,t+1,time,grid);
        expand(i-1,j,t+1,time,grid);
        expand(i,j+1,t+1,time,grid);
        expand(i,j-1,t+1,time,grid);
    }
    public int orangesRotting(int[][] grid) {
        int ans = 0;
        int[][] time = new int[grid.length][grid[0].length];
        for(int[] row : time)
            Arrays.fill(row, Integer.MAX_VALUE);

        for(int i = 0 ; i < grid.length;i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 0 || grid[i][j] == 1 ) 
                    continue;
                expand(i,j,0,time,grid);
            }
        }

        for(int i = 0 ; i < grid.length;i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1 && time[i][j] == Integer.MAX_VALUE)
                    return -1;
                if(time[i][j] != Integer.MAX_VALUE)
                    ans = Math.max(ans,time[i][j]);
            }
        }
        return ans;
    }
}