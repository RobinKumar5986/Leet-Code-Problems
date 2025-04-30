class Solution {
    boolean canReach = false;
    boolean[][] vis;
    Stack<int[]> stk;
    void expand(char[][] board, int row , int col){
        if(row < 0 || col < 0 || row >= board.length || col >= board[0].length || 
        vis[row][col] || board[row][col] == 'X')
            return;
        vis[row][col] = true;
        stk.add(new int[]{row, col});

        if(row == 0 || col == 0 || row == board.length -1 || col == board[0].length -1)
            canReach = true;
        
        if(row - 1 >= 0 ) expand(board,row-1,col);
        if(row + 1 < board.length) expand(board,row+1,col);
        if(col - 1 >= 0) expand(board,row,col-1);
        if(col + 1 < board[0].length) expand(board,row,col+1);
        
    }
    public void solve(char[][] board) {
        vis = new boolean[board.length][board[0].length];
        for(int i = 0; i < board.length; i++){
            for(int j = 0 ; j < board[0].length ; j++){
                if(vis[i][j] || board[i][j] == 'X')
                    continue;
                stk = new Stack<>();
                canReach = false;
                expand(board,i,j);
                if(canReach == false){
                    while(!stk.isEmpty()){
                        int[] cord = stk.pop();
                        board[cord[0]][cord[1]] = 'X';
                    }
                }
            }
        }
    }
}