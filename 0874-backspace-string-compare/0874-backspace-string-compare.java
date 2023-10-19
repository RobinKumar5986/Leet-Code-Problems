class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1=new Stack<>();
        Stack<Character> st2=new Stack<>();

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='#'){
               if(!st1.isEmpty())
                    st1.pop();
            }
            else{
                st1.push(c);
            }
        }
        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            if(c=='#' ){
                if(!st2.isEmpty())
                    st2.pop();
            }
            else{
                st2.push(c);
            }
        }
        if(st1.size()!=st2.size()) return false;
        while(!st1.isEmpty()){
            char c1=st1.pop();
            char c2=st2.pop();
            if(c1!=c2) return false;
            
        }
        
        return true;   
    }
}