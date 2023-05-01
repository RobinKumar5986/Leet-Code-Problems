class Solution {
//------------implementation form Scratch------------//

    // public void push(char val,char ar[],int top){
    //     ar[top]=val;
    // }
    // public char pop(int top,char ar[]){
    //     return ar[top];
    // }

//-------------------------------------------------//

    // public boolean isValid(String s) {
        // if(s.length()%2!=0) return false;

        // int top=-1;
        // Solution sol=new Solution();

        // char[] ar=new char[s.length()];

        // for(int i=0;i<s.length();i++){
        //     char c=s.charAt(i);
        //     if(c=='(' || c=='{' || c=='['){
        //         if(c=='('){
        //             c=')';
        //         }else if(c=='{'){
        //             c='}';
        //         }else{
        //             c=']';
        //         }
        //         top+=1;
        //         sol.push(c,ar,top);
        //         System.out.println(ar[top]);
        //     }else{
        //         if(top<0) return false;
        //         char c2=sol.pop(top,ar);
        //         top-=1;

        //         if(c!=c2) return false;
        //     }
        // }
        // System.out.println("TOP : "+top);
        // if(top!=-1) return false;
        // return true;
    // }
    public boolean isValid(String s) {
//-------Implementation Using Stack data Structure-------//
        Stack<Character> para=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='(') para.push(')');
            else if(c=='{') para.push('}');
            else if(c=='[') para.push(']');
            else{
                if(para.isEmpty()) return false;
                char c2=para.pop();
                if(c!=c2) return false;
            }
        }
        if(para.isEmpty()) return true;
        return false;

    }
}