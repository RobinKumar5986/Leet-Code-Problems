class Solution {
    public int evalRPN(String[] nums) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<nums.length;i++){
            String ch=nums[i];

            if(!ch.equals("+") && !ch.equals("-") && !ch.equals("*") && !ch.equals("/")){
                int n=Integer.parseInt(ch);
                st.push(n);
            }else{
                int n2=st.pop();
                int n1=st.pop();
                if( ch.equals("+") ) st.push(n1+n2);
                if( ch.equals("-") ) st.push(n1-n2);
                if( ch.equals("*") ) st.push(n1*n2);
                if( ch.equals("/") ) st.push(n1/n2);                 
            }
        }
        return st.peek();

    }
}