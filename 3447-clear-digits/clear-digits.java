class Solution {
    public String clearDigits(String s) {
        Stack<Character> stk = new Stack<>();
        for(char c : s.toCharArray()){
            if(c >= '0' && c<='9'){
                stk.pop();
            }else{
                stk.push(c);
            }
        }
        String ans = "";
        while(!stk.isEmpty()){
            char c = stk.pop();
            ans = c+ans;
        }
        return ans;
    }
}