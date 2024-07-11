class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st=new Stack<>();
        for(char ele : s.toCharArray()){
            if(ele!=')'){
                st.push(ele);
            }else{
                StringBuilder sb=new StringBuilder();
                while(!st.isEmpty()){
                    char c=st.pop();
                    if(c=='(')
                        break;
                    sb.append(c);
                }
                for(int i=0;i<sb.length();i++){
                    st.push(sb.charAt(i));
                }
            }
            
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}