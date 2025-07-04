class Solution {
    public boolean isValidSudoku(char[][] board) {
        //1.check the row and coloum
        for(int col = 0; col<9 ; col++){
            boolean[] set = new boolean[10];
            for(int i = 0 ; i < 9 ; i++){
                if(board[i][col] == '.')
                    continue;
                int val = board[i][col] - '0';
                if(set[val])
                    return false;
                set[val] = true;
            }
        }
        for(int row = 0; row<9 ; row++){
            boolean[] set = new boolean[10];
            for(int i = 0 ; i < 9 ; i++){
                if(board[row][i] == '.')
                    continue;
                int val = board[row][i] - '0';
                if(set[val])
                    return false;
                set[val] = true;
            }
        }

        //2.checking for 3x3 
        for(int row = 0; row < 9; row += 3){
            for(int col = 0; col < 9 ; col += 3){
                boolean[] set = new boolean[10];
                for(int i = row; i < row+3 ; i++){
                    for(int j = col ; j<col+3 ; j++){
                        if(board[i][j] == '.')
                            continue;
                        int val = board[i][j] - '0';
                        if(set[val])
                            return false;
                        set[val] = true;
                    }
                }
            }
        }
        return true;
    }
}