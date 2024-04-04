class Solution {
    public int maxDepth(String s) {
        if(s.length()<=0 || ( s.length()==1 && s.charAt(0)!=')' && s.charAt(0)!='(' ) )
            return 0;  
        int stk=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(')
                stk++;
            else if(s.charAt(i)==')'){
                 if(max<stk ){
                    max=stk;
                }
                stk--;
            }
        }
        return max;
    }
}