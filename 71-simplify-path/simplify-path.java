class Solution {
    public String simplifyPath(String p) {
        String[] path = p.split("/");
        Stack<String> stk = new Stack<>();
        for(String ele : path){
           
            if(ele.isEmpty() || ele.equals("."))
                continue;

            if(ele.equals("..")){
                if(!stk.isEmpty()){
                    stk.pop();
                }
            }else{
                stk.push(ele);
            }
        }
        if(stk.isEmpty()) return "/";

        String ans = "";
        while(!stk.isEmpty()){
            String ele = stk.pop();
            ans = "/" + ele + ans;
        }
        return ans;
    }
}