class Solution {
    Set<String> set = new HashSet<>();
    Boolean[][] dp;

    boolean dfs(int lo, int hi, String s){
        if(hi >= s.length()){
            if( lo == hi )
                return true;
            return false;
        }
        if(dp[lo][hi] != null)
            return dp[lo][hi];
        
        String sub = s.substring(lo,hi+1);
       
        //include not include
        boolean isOk = dfs(lo,hi+1,s);

        //is part of dictionary
        if(!isOk && set.contains(sub))
            isOk = dfs(hi+1,hi+1,s);
        
        dp[lo][hi] = isOk;

        return isOk;
        
    }    
    
    public boolean wordBreak(String s, List<String> wordDict) {
        for(String w : wordDict)
            set.add(w);
        dp = new Boolean[s.length()][s.length()];
        return dfs(0,0,s);
    }
}