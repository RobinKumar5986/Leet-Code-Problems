class Solution {
    Boolean[][] dp;
    boolean isPalindrome(int lo, int hi, String s){
        if(lo >= hi)
            return true;
        if(dp[lo][hi] != null)
            return dp[lo][hi];
        Boolean res = null;
        if(s.charAt(lo) != s.charAt(hi)){
            res = false;
        }else{
            res = isPalindrome(lo+1,hi-1,s);
        }
        dp[lo][hi] = res;

        return res;
    }
    public String longestPalindrome(String s) {
        dp = new Boolean[s.length()][s.length()];

        int lo = 0;
        int hi = 0;
        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < s.length(); j++){
                if(isPalindrome(i,j,s)){
                    if(j-i > hi-lo){
                        hi = j;
                        lo = i;
                    }
                }
            }
        }
        return s.substring(lo,hi+1);
    }
}