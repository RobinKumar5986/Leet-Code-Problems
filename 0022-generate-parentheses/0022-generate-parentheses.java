class Solution {
    void valid(String para,int open,int close,List<String> ans,int n){
        if(open+close==n*2) ans.add(para);
        if(open<n) valid(para+"(",open+1,close,ans,n);
        if(close<open) valid(para+")", open, close+1,ans,n);
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        valid("(",1,0,ans,n);
        return ans; 
    }
}