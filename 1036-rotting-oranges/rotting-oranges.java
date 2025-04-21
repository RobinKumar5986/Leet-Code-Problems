class Solution {
    public int orangesRotting(int[][] grid) {
        int ans = 0;
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;
        for(int i = 0; i<grid.length; i++){
            for(int j = 0 ; j < grid[0].length ; j++){
                if(grid[i][j] == 1)
                    fresh++;
                if(grid[i][j] == 2)
                    q.offer(new int[]{i,j});
            }
        }
        if(!q.isEmpty() && fresh == 0)
            return 0;
        while(!q.isEmpty()){
            if(fresh == 0)
                break;
            ans++;
            int sz = q.size();
            for(int i = 0 ; i < sz ; i++){
                int[] ele = q.poll();
                int r = ele[0];
                int c = ele[1];
                //up
                if(r-1 >= 0 && grid[r-1][c] == 1){
                    grid[r-1][c] = 2;
                    q.offer(new int[]{r-1,c});
                    fresh--;
                }
                //down
                if(r+1 < grid.length && grid[r+1][c] == 1){
                    grid[r+1][c] = 2;
                    q.offer(new int[]{r+1,c});
                    fresh--;
                }
                //left
                if(c-1 >= 0 && grid[r][c-1] == 1){
                    grid[r][c-1] = 2;
                    q.offer(new int[]{r,c-1});
                    fresh--;
                }
                //right
                if (c + 1 < grid[0].length && grid[r][c + 1] == 1) {
                    grid[r][c + 1] = 2;
                    q.offer(new int[]{r, c + 1});
                    fresh--;
                }
            }
        }
        if(fresh == 0)
            return ans;
        return -1;
    }
}