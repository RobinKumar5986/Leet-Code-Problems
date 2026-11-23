class Solution {
    int[][] dp;

    int dfs(int i, int j,String s1,String s2){
        if (i >= s1.length())
            return s2.length() - j;
        if (j >= s2.length())
            return s1.length() - i;
        if(dp[i][j] != -1)
            return dp[i][j];
        Integer min = null;
        if(s1.charAt(i) == s2.charAt(j)){
            min = dfs(i+1,j+1,s1,s2); //no step taken
        }else{
            int n1 = dfs(i,j+1,s1,s2) + 1; //insert thus char at i == j (hypothetically)
            int n2 = dfs(i+1,j,s1,s2) + 1; //delete thus i need to go to next char
            int n3 = dfs(i+1,j+1,s1,s2) + 1; //replace char thus now both char is equal
            
            min = Math.min(n1,Math.min(n2,n3));
        }
        dp[i][j] = min;
        return min;
    }
    public int minDistance(String s1, String s2) {
        dp = new int[s1.length()][s2.length()];
        for(int[] row : dp)
            Arrays.fill(row,-1);
        return dfs(0,0,s1,s2);
    }
}