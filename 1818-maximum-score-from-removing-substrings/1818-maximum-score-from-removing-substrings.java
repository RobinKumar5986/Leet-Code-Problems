class Solution {
    public int maximumGain(String s, int x, int y) {
        char[] check=new char[2];
        if(x>y){
            check[0]='a';
            check[1]='b';
        }else{
            check[0]='b';
            check[1]='a';
        }
        int ans=0;
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=check[1]){
                st.push(s.charAt(i));
            }else{
                if(!st.isEmpty() && st.peek()==check[0]){
                    st.pop();
                    ans+=Math.max(x,y);
                }else{
                    st.push(s.charAt(i));
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)!=check[0]){
                st.push(sb.charAt(i));
            }else{
                if(!st.isEmpty() && st.peek()==check[1]){
                    st.pop();
                    ans+=Math.min(x,y);
                }else{
                    st.push(sb.charAt(i));
                }
            }
        }
        return ans;
    }
}