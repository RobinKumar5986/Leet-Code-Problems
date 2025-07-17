class Solution {
    List<String> ans = new ArrayList<>();
    int max;
    void generate(int open,int close, String cur){
        if(open == max && close == max){
            ans.add(cur);
            return;
        }
        if(open < max){
            generate(open+1 , close,cur + "(");
        }
        if(close < open){
            generate(open , close + 1,cur + ")");
        }
        
    }
    public List<String> generateParenthesis(int n) {
        max = n;
        generate(0,0,"");
        return ans;
    }
}