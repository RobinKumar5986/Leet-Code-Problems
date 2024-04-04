class Solution {
    public int maxDepth(String s) {
        if(s.length()<=0 || ( s.length()==1 && s.charAt(0)!=')' && s.charAt(0)!='(' ) )
            return 0;  
        Stack<Character> stk=new Stack<>();
        int max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stk.push('(');
            }
            else if(s.charAt(i)==')'){
                 if(max<stk.size() ){
                    max=stk.size();
                }
                stk.pop();
            }
        }
        return max;
    }
}