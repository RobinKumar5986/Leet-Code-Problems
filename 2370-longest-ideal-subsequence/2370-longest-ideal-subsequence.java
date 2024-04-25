class Solution {
    int max=Integer.MIN_VALUE;
    int[][] dp;
    int subSeq(String s,char prev,int i,int k){
        if(i>=s.length())
            return 0;
        if(prev!=' '&& dp[prev -'a'][i]!=0)
            return dp[prev - 'a'][i];
        int res=subSeq(s,prev,i+1,k);
        if(prev==' ' || Math.abs(prev - s.charAt(i) )<=k){
            res=Math.max(res,subSeq(s,s.charAt(i), i+1,k)+1);
            if (prev >= 'a' && prev <= 'z') {
                dp[prev - 'a'][i] = res;
            }
        }
        return res;
    }
    public int longestIdealString(String s, int k) {
        dp=new int[26][s.length()];
        return subSeq(s,' ',0,k);
        
    }
}