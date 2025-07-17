class Solution {
    public int evalRPN(String[] t) {
        Stack<Integer> stk = new Stack<>();
        for(int i = 0 ; i < t.length ; i++){
            if(t[i].equals("+") || t[i].equals("-") || t[i].equals("*") || t[i].equals("/")){
                int v2 = stk.pop();
                int v1 = stk.pop();
                if(t[i].equals("+")){
                    stk.push(v1+v2);
                }else if(t[i].equals("-")){
                    stk.push(v1-v2);
                }else if (t[i].equals("*")){
                    stk.push(v1*v2);
                }else if (t[i].equals("/")){
                    stk.push(v1/v2);
                }
            }else{
                int val = Integer.parseInt(t[i]);
                stk.push(val);
            }
        }
        return stk.pop();
    }
}