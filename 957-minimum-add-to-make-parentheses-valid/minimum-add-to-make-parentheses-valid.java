class Solution {
    public int minAddToMakeValid(String s) {
        int ans = 0;
        int c = 0;
        for(int i= 0 ; i < s.length() ;i++){
            char ch = s.charAt(i);
            if(ch == ')'){
                if(c == 0)
                    ans++;
                else
                    c--;
            }else{
                c++;
            }
        }
        ans += c;
        return ans;
    }
}