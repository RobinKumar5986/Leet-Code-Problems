class Solution {
    public String removeKdigits(String num, int k) {
        int len=num.length();
        if(len<=k )return "0";

        Stack<Character> stack=new Stack<>();

        int i=0;
        while(i<len){
            while(k>0 && !stack.isEmpty() && stack.peek()>num.charAt(i)){
                stack.pop();
                k--;
            }
            stack.push(num.charAt(i));
            i++;
        }
        while(k>0){
            stack.pop();
            k--;
        }
        String ans="";
        while(!stack.isEmpty()){
            ans=stack.pop()+ans;
        }
        StringBuilder nAns=new StringBuilder(ans);

        while(nAns.length()>1 && nAns.charAt(0)=='0')
            nAns.deleteCharAt(0);
        return nAns.toString();
    }
}