class Solution {
    private int count = 0;
    private String ans = "";

    void backTrack(StringBuilder cur, int n,int k){
        if(count == k){
            return;
        }
        if(cur.length() == n){
            count++;
            if(count == k){
                ans = cur.toString();
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
        return ans;
    }
}