class Solution {
    public int[][] restoreMatrix(int[] r, int[] c) {
        int[][] ans=new int[r.length][c.length];
        for(int row=0;row<ans.length;row++){
            for(int col=0;col<ans[0].length;col++){
                if(r[row]==0 || c[col]==0){
                    continue;
                }else{
                    if(r[row]<c[col]){
                        ans[row][col]=r[row];
                        c[col]-=r[row];
                        r[row]=0;
                    }else{
                        ans[row][col]=c[col];
                        r[row]-=c[col];
                        c[col]=0;
                    }
                }
            }
        }
        return ans;
    }
}