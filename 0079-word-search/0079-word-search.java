class Solution {
    boolean dfs(int i,int j,boolean[][] vis,char[][] board,String word,int n,int m ,int id){
        if(id==word.length()-1)
            return true;
        vis[i][j]=true;
        if(i+1<n && !vis[i+1][j] && word.charAt(id+1)==board[i+1][j] && dfs(i+1,j,vis,board,word,n,m, id+1)||
         i-1>=0 && !vis[i-1][j] && word.charAt(id+1)==board[i-1][j] && dfs(i-1,j,vis,board,word,n,m, id+1) ||
         j+1 <m && !vis[i][j+1] && word.charAt(id+1)==board[i][j+1] && dfs(i,j+1,vis,board,word,n,m,id+1)  ||
         j-1 >= 0 && !vis[i][j-1] && word.charAt(id+1)==board[i][j-1] && dfs(i,j-1,vis,board,word,n,m,id+1) )
            return true;

        vis[i][j]=false;
        return false;
    }
    public boolean exist(char[][] board, String word) {
        int r=board.length;
        int c=board[0].length;
        boolean[][] vis =new boolean[r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(board[i][j]==word.charAt(0) && dfs(i,j,vis,board,word,r,c ,0)){  
                        return true;
                }
            }
        }
        return false;
    }
}