class Solution {
    boolean[][] vis;
    void expand(char[][] board, int row, int col){
        if(row < 0 || col < 0 || row >= board.length || col >= board[0].length || vis[row][col])
            return;
        if(board[row][col] == 'X')
            return;
        vis[row][col] = true;

        expand(board,row-1,col);
        expand(board,row+1,col);
        expand(board,row,col-1);
        expand(board,row,col+1);
    }
    public void solve(char[][] board) {
        vis = new boolean[board.length][board[0].length];
        //top & bottom
        for(int col = 0; col < board[0].length ; col++){
            if(board[0][col] == 'O')expand(board,0,col);
            if(board[board.length-1][col] == 'O')expand(board,board.length-1,col);
        }
        //left & right
        for(int row = 0; row < board.length ; row++){
            if(board[row][0] == 'O')expand(board,row,0);
            if(board[row][board[0].length-1] == 'O')expand(board,row,board[0].length-1);
        }
        for(int i = 1; i< board.length-1 ; i++){
            for(int j = 1; j < board[0].length-1 ; j++){
                if(vis[i][j] || board[i][j] == 'X')continue;
                board[i][j] = 'X';
            }
        }
    }
}