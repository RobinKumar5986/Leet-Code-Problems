class Solution {
    public int maximalSquare(char[][] matrix) {
        int ans = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] memo = new int[m][n];

        for(int  i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == '0') continue;
                int min = 0;
                if(i > 0 && j > 0)
                    min = Math.min(memo[i-1][j], Math.min(memo[i][j-1], memo[i-1][j-1]));
                min += 1;
                memo[i][j] = min;
                ans = Math.max(ans, min);
            }
        }
        return ans*ans;
    }
}