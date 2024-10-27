class Solution {
    public int countSquares(int[][] mat) {
        int[][] dp = new int[mat.length][mat[0].length];
        int ans = 0;
        for(int i = 0 ; i < mat.length ; i++){
            for(int j = 0 ; j < mat[0].length ; j++ ){
                if(mat[i][j] == 1){
                    if(i > 0 && j > 0){
                        dp[i][j] = Math.min(Math.min(dp[i-1][j], dp[i][j-1]), dp[i-1][j-1]) + 1;
                    }else{
                        dp[i][j] = 1;
                    }
                }
                ans += dp[i][j];
            }
        }
        return ans;

    }
}