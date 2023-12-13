class Solution {
    public int numSpecial(int[][] mat) {
        int ans=0;
        for(int row=0;row<mat.length;row++){
            for(int col=0;col<mat[0].length;col++){
                if(mat[row][col] == 0) continue;

                boolean flag=true;
                for(int r=0; r<mat.length ; r++){
                    if(r!=row && mat[r][col] ==1){
                        flag=false;
                        break;
                    }
                }
                for(int c=0;c<mat[0].length ;c++){
                    if(c!=col && mat[row][c] ==1){
                        flag=false;
                        break;
                    }
                }
                if(flag)
                    ans++;
            }
        }
        return ans;
    }
}