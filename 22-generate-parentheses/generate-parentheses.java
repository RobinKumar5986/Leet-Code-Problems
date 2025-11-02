class Solution {
    List<String> ans = new ArrayList<>();
    void generate(int open, int close,int n ,String str){
        if(open > n || close > n)
            return;
        if(open == close && open == n){
            ans.add(str);
            return;
        }
        //decision for adding open or close br
        
        //1.case 1 just add open br
        generate(open+1,close,n,str + "(");
        //2.case 2 open br is grater then close br then add close br
        if(open > close){
            generate(open,close+1,n,str + ")");
        }
    }
    public List<String> generateParenthesis(int n) {
        generate(0,0,n,"");

        return ans;
    }
}