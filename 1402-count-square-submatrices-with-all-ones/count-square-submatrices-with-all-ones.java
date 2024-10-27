class Solution {
    boolean check(int n, int lo, int hi, int[][] mat){
        for(int i = lo ; i <lo + n ;i++){
            for(int j = hi ; j< hi + n; j++){
                if(mat[i][j] == 0)
                    return false;
            }
        }     
        return true;
    }
    public int countSquares(int[][] mat) {
        int ans = 0;
        int n = Math.min(mat.length, mat[0].length);
        int lo = 0;
        int hi = lo + n ;
        for(int w = 1 ; w <= n ; w++){
            for(int row = 0 ; row < mat.length - w + 1 ; row++ ){
                for(int col = 0 ; col < mat[0].length - w + 1 ; col++ ){
                    if( check(w,row,col,mat)){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}