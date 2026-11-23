class Solution {
    int[][] dp;
    int dfs(int i,int j,String s1 , String s2){
        if(i >= s1.length() || j >= s2.length())
            return 0;
        if(dp[i][j] != -1)
            return dp[i][j];
        
        Integer max = null;
        if(s1.charAt(i) == s2.charAt(j)){
            max = dfs(i+1,j+1,s1,s2) + 1;//marking as taking the element
        }else{
            int skpS1 = dfs(i+1,j,s1,s2);
            int skpS2 = dfs(i,j+1,s1,s2);
            
            max = Math.max(skpS1,skpS2);
        }
        dp[i][j] = max;
        return max;

    }
    public int longestCommonSubsequence(String s1, String s2) {
        dp = new int[s1.length()][s2.length()];
        for(int[] row : dp)
            Arrays.fill(row,-1);
        return dfs(0,0,s1,s2);
    }
}