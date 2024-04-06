class Solution {
    public String minRemoveToMakeValid(String s) {
        String ans="";
        int miss=0;
        Stack<Integer> stk=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stk.push(i);
            }
            else if( s.charAt(i)==')' && !stk.isEmpty() ){
                int ind=stk.pop()-stk.size()-miss;
                String temp = ans.substring(0,ind);
                String temp2= ans.substring(ind);

                ans= temp+"("+temp2+")";
                
            }else if (s.charAt(i)==')'){
                miss++;
            }else{
                ans=ans + s.charAt(i);
            }

        }
        return ans;
    }
}