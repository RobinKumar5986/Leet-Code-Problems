class Solution {
    public boolean isValidSudoku(char[][] board) {

        //validating row and col O(9*9) --> O(1)
        for(int row=0;row<9;row++){
            Set<Character> map1=new HashSet<>();
            Set<Character> map2=new HashSet<>();

            for(int col=0;col<9;col++){
                if(map1.contains(board[row][col]) || map2.contains(board[col][row]) )
                    return false;
                if(board[row][col]!='.')
                    map1.add(board[row][col]);
                if(board[col][row]!='.')
                    map2.add(board[col][row]);
            }
        }

        for(int row = 0;row < 9;row+= 3){
            for(int col = 0;col < 9; col+= 3){
                Set<Character> map=new HashSet<>();
                for(int i=row;i < row+3 ;i++){
                    for(int j=col; j<col+3;j++){
                        if( map.contains(board[i][j]) )
                            return false;
                        if(board[i][j]!='.')
                            map.add(board[i][j]);
                    }
                }
            }
        }
        return true;
    }
}