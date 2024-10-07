class Solution {
    public int minLength(String s) {
        Stack<Character> stk = new Stack<>();
        for(char c : s.toCharArray()){
            if(!stk.isEmpty()){
                if(stk.peek() == 'A' && c == 'B' )
                    stk.pop();
                else if(stk.peek() == 'C' && c == 'D' )
                    stk.pop();
                else 
                    stk.push(c);
            }else{
                stk.push(c);
            }
        }
    
        return stk.size();
    }
}