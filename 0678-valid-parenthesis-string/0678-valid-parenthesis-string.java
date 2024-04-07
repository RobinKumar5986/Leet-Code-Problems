class Solution {
    public boolean checkValidString(String s) {
        int stk=0;
        int str=0;
        int close=0;

        //Left Scan Check
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                stk++;
            }
            else if(c=='*'){
                str++;
            }
            else if(c==')' && str<=0 && stk<=0)
                return false;
            else if (c==')'){
                if(stk > 0)
                    stk--;
                else if( str > 0)
                    str--;
            }
        }
        if(stk > str)return false;

        stk=0;
        str=0;
        //Right Scan Check
        for(int i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);
            if(c==')'){
                stk++;
            }
            else if(c=='*'){
                str++;
            }
            else if(c=='(' && str<=0 && stk<=0)
                return false;
            else if (c=='('){
                if(stk > 0)
                    stk--;
                else if( str > 0)
                    str--;
            }
        }
        if(stk > str)return false;
        return true;
    }
}