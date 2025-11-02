class Solution {
    //visited = 1
    //walls = 2
    //guard = 3
    int ans;
    int[][] grid;
    void fillAllDir(int row,int col,int m , int n){
        boolean skp = true;
        //filling up
        for(int i = row; i >= 0 ; i--){
            if((grid[i][col] == 2 || grid[i][col] == 3) && !skp)
                break;
            skp = false;
            if(grid[i][col] == 0){
                ans--;
                grid[i][col] = 1;
            }
        }
        skp = true;
        //filling down
        for(int i = row; i < m; i++){
            if((grid[i][col] == 2 || grid[i][col] == 3) && !skp)
                break;
            skp = false;
            if(grid[i][col] == 0){
                ans--;
                grid[i][col] = 1;
            }
        }

        skp = true;
        //filling left
        for(int i = col; i >= 0; i--){
            if((grid[row][i] == 2 || grid[row][i] == 3) && !skp)
                break;
            skp = false;
            if(grid[row][i] == 0){
                ans--;
                grid[row][i] = 1;
            }
        }
        skp = true;
        //filling right
        for(int i = col ; i < n; i++){
            if((grid[row][i] == 2 || grid[row][i] == 3) && !skp)
                break;
            skp = false;
            if(grid[row][i] == 0){
                ans--;
                grid[row][i] = 1;
            }
        }
    }
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        n = n;
        m = m;
        ans = m * n;
        grid = new int[m][n];
        for(int[] wall : walls){
            grid[wall[0]][wall[1]] = 2;
            ans--;
        }
        for(int[] guard : guards){
            grid[guard[0]][guard[1]] = 3;
            ans--;
        }
        for(int[] guard : guards){
            fillAllDir(guard[0],guard[1],m,n);
        }
        return ans;
    }
}