class Solution {
    Stack<String> stk = new Stack<>();
    String smallestLex(String s1 , String s2){
        if(s1.length() != s2.length())
            return null;
        for(int i = 0 ; i < s1.length(); i++ ){
            if(s1.charAt(i) > s2.charAt(i))
                return s2;
            if(s1.charAt(i) < s2.charAt(i))
                return s1;
        }
        return s1;
    }
    void backTrack(StringBuilder cur, int n,int k){
        if(cur.length() == n){
            if(stk.size() == k){
                String su = stk.pop();
                su = smallestLex(su, cur.toString());
                stk.push(su);
            }else{
                stk.push(cur.toString());
            }
            return;
        }
        if(cur.length() == 0){
            for(char c = 'a' ; c <= 'c' ; c++){
                //addd
                cur.append(c);
                backTrack(cur,n,k);
                cur.deleteCharAt(cur.length()-1);
                //remove
            } 
        }else{
            for(char c = 'a' ; c <= 'c' ; c++){
                char ch = cur.charAt(cur.length() - 1);
                if(ch != c){
                    //addd
                    cur.append(c);
                    backTrack(cur,n,k);
                    cur.deleteCharAt(cur.length()-1);
                    //remove
                }
            }
        }
    }
    public String getHappyString(int n, int k) {
        StringBuilder sb = new StringBuilder();
        backTrack(sb,n,k);
        if(stk.size() != k){
            return "";
        }
        return stk.peek();
    }
}