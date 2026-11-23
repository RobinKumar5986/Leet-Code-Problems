class Solution {
    int[][] dp;
    //topdown approach
    int dfs(int i,int j, int m, int n){
        if( i == m-1 && j == n-1)
            return 1; // reached the bottom
        if(i >= m || j >= n)
            return 0; // went out of the grid
        if(dp[i][j] != -1)
            return dp[i][j];
        //tow case i.e we can do forward or bittom
        int sum = dfs(i+1,j,m,n) + dfs(i,j+1,m,n);

        return dp[i][j] = sum;
    }
    public int uniquePaths(int m, int n) {
        dp = new int[m][n];
        for(int[] row : dp)
            Arrays.fill(row,-1);
        
        return dfs(0,0,m,n);
    }
}