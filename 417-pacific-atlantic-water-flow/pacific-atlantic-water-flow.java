class Solution {
    //brute force sol
    boolean pesfic = false;
    boolean atlantic = false;
    boolean[][] vis;
    void dfs(int[][] hig, int row, int col){
        if(row -1 < 0 || col  - 1 < 0)
            pesfic = true;
        if(row+1 >= hig.length || col +1 >= hig[0].length)
            atlantic = true;
        if(pesfic && atlantic)
            return;
        if(vis[row][col])
            return;
        vis[row][col] = true;
        //up
        if(row - 1 >= 0 && hig[row-1][col] <= hig[row][col])
            dfs(hig,row-1,col);
        //left
        if(col - 1 >= 0 && hig[row][col-1] <= hig[row][col])
            dfs(hig,row,col-1);
        //down
        if(row + 1 < hig.length && hig[row+1][col] <= hig[row][col])
            dfs(hig,row+1,col);
        //right
        if(col + 1 < hig[0].length && hig[row][col+1] <= hig[row][col])
            dfs(hig,row,col+1);
    }
    public List<List<Integer>> pacificAtlantic(int[][] hig) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int row = 0 ; row < hig.length; row++){
            for(int col = 0 ; col < hig[0].length ; col++){
                vis = new boolean[hig.length][hig[0].length];
                pesfic = false;
                atlantic = false;
                dfs(hig,row,col);
                if(pesfic && atlantic)
                    ans.add(Arrays.asList(row, col));
            }
        }
        return ans;
    }
}