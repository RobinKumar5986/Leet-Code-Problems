class Solution {
    boolean isPali(String s){
        int lo = 0;
        int hi = s.length()-1;
        while(lo < hi){
            if(s.charAt(lo) != s.charAt(hi))
                return false;
            lo++;
            hi--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        String ans = "";
        for(int i = 0 ; i < s.length(); i++){
            StringBuilder sb = new StringBuilder();
            for(int j = i; j < s.length(); j++){
                sb.append(s.charAt(j));
                if( isPali(sb.toString()) && sb.length() > ans.length()){
                    ans = sb.toString();
                }
            }
        }

        return ans;
    }
}