class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int m = grid.length;
        int n = grid[0].length;

        if(grid[0][0] == 1 || grid[m-1][m-1] == 1)
            return -1;
        int[][] step = new int[m][n];

        for(int[] row : step)
            Arrays.fill(row,Integer.MAX_VALUE);
        
        //bfs search
        q.offer(new int[]{0,0}); //i,j
        step[0][0] = 1;
        while(!q.isEmpty()){
            int[] num = q.poll();
            int i = num[0];
            int j = num[1];
        
            //8-direction movement
            int[][] dir = new int[][]{
                {1, 0}, {1, 1}, {0, 1}, {-1, 1}, {-1, 0}, {-1, -1}, {0, -1}, {1, -1}
            };

            for(int[] d : dir){
                int ni = i + d[0];
                int nj = j + d[1];

                if (ni < 0 || nj < 0 || ni >= m || nj >= n) 
                    continue;
                if(grid[ni][nj] == 1)
                    continue; //can't go
                
                if(step[i][j] + 1 < step[ni][nj]){
                    step[ni][nj] = step[i][j] +1;
                    q.offer(new int[]{ni,nj});
                }
            }
        }
        if(step[m-1][n-1] == Integer.MAX_VALUE)
            return -1;
        return step[m-1][n-1];
    }
}