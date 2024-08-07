class Solution {
    int maxRow,maxCol;
    void dfs(int[][] land,int row,int col){
        if(row>=land.length || col>=land[0].length)
            return;
        if(land[row][col]!=1)
            return;
        land[row][col]=0;
        if(row>maxRow)
            maxRow=row;
        if(col>maxCol)
            maxCol=col;
        dfs(land,row+1,col);
        dfs(land,row,col+1);
    }

    public int[][] findFarmland(int[][] land) {
        List<int[]> ans=new ArrayList<>();
        for(int row=0;row<land.length;row++){
            for(int col=0;col<land[0].length;col++){
                if(land[row][col]!=1)
                    continue;
                dfs(land,row,col);
                    ans.add(new int[]{row,col,maxRow,maxCol});
                    maxRow=-1;
                    maxCol=-1;
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}