class Solution {
    public int evalRPN(String[] nums) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<nums.length;i++){
            char c=nums[i].charAt(nums[i].length()-1);
            if(c!='+' && c!='-' && c!='*' && c!='/'){
                st.push(Integer.parseInt(nums[i]));
            }else{
                int n1=st.pop();
                int n2=st.pop();
                switch(c){
                    case '+':
                        st.push(n2+n1);
                        break;
                    case '-':
                        st.push(n2-n1);
                        break;
                    case '*':
                        st.push(n2*n1);
                        break;
                    case '/':
                        st.push(n2/n1);
                        break;
                }
            }

        }
        return st.pop();   
    }
}