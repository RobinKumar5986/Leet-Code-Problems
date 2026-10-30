class Solution {
    
    public boolean isValidSudoku(char[][] grid) {
        //Row Validation
        for(int i = 0; i < grid[0].length; i++){
            boolean[] vis = new boolean[10];
            for(int j = 0; j < grid.length; j++){
                int num = grid[i][j] - '0';
                if(num < 1 || num > 9) continue;
                if(vis[num]) return false;
                vis[num] = true;
            }
        }
        //Col validation
        for(int i = 0; i < grid.length; i++){
            boolean[] vis = new boolean[10];
            for(int j = 0; j < grid[0].length; j++){
                int num = grid[j][i] - '0';
                if(num < 1 || num > 9) continue;
                if(vis[num]) return false;
                vis[num] = true;
            }
        }
        
        // 3x3 validation 
        for(int row = 0; row < grid[0].length; row += 3){
            for(int col = 0; col < grid.length; col += 3){
                boolean[] vis = new boolean[10];
                for(int r = row; r < row+3; r++){
                    for(int c = col ; c < col+3; c++){
                        int num = grid[r][c] - '0';
                        if(num < 1 || num > 9) continue;
                        if(vis[num]) return false;
                        vis[num] = true;
                    }
                }
            }
        }

        return true;

    }
}