class Solution {
    public int minAddToMakeValid(String s) {
        int ans = 0;
        int c = 0;
        for(char ch : s.toCharArray()){
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