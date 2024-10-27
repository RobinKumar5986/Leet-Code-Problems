class Solution {
    public int countSquares(int[][] mat) {
        int rLen = mat.length;
        int cLen = mat[0].length;
        int[][] dp = new int[rLen][cLen];
        int ans = 0;

        // Initialize DP table and calculate counts
        for (int i = 0; i < rLen; i++) {
            for (int j = 0; j < cLen; j++) {
                if (mat[i][j] == 1) {
                    // If we're not in the first row or column, calculate min of neighboring squares
                    if (i > 0 && j > 0) {
                        dp[i][j] = Math.min(Math.min(dp[i-1][j], dp[i][j-1]), dp[i-1][j-1]) + 1;
                    } else {
                        // Cells in the first row or column can only form 1x1 squares
                        dp[i][j] = 1;
                    }
                    ans += dp[i][j]; // Accumulate count of squares
                }
            }
        }
        return ans;
    }
}
