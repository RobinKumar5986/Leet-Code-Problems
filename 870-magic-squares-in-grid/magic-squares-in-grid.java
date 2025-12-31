class Solution {
    boolean isMagicSqr(int row,int col,int[][] grid){
        int mR = grid.length;
        int mC = grid[0].length;
        boolean[] set = new boolean[10];
        if(row + 3 - 1 >= mR || col + 3 - 1 >= mC){
            return false;
        }
        int sum = 0;
        //getting initial sum
        for(int i = 0 ; i < 3; i++){
            sum += grid[row][col+i];
        }

        //checking all rows.
        for(int i = row; i < row + 3;i++){
            int s = 0;
            for(int j = col; j< col + 3; j++){
                if(grid[i][j] > 9 || grid[i][j] < 1){
                    return false;
                }
                if(set[grid[i][j]]){
                    return false;
                }
                s += grid[i][j];
                set[grid[i][j]] = true;
            }
            if(s != sum){
                return false;
            }
        }

        //checking all coloums
        for(int i = col; i < col + 3;i++){
            int s = 0;
            for(int j = row; j < row + 3; j++){
                s += grid[j][i];
            }
            if(s != sum){
                return false;
            }
        }

        //checking diagonals
        int d1 = 0;
        int d2 = 0;
        for(int i = 0 ; i < 3; i++){
            d1 += grid[row + i][col + i];
            d2 += grid[row + i][col + 3 - 1 - i];
        }
        if(d1 != sum || d2 != sum){
            return false;
        }
        return true;
    }
    public int numMagicSquaresInside(int[][] grid) {
        int ans = 0;
        for(int i = 0 ; i < grid.length; i++){
            for(int j = 0 ; j < grid[0].length; j++){
                if(isMagicSqr(i,j,grid)){
                    ans++;
                }
            }
        }
        return ans;
    }
}