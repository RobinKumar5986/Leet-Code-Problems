class Solution {
    String expand(String st, int lo, int hi, String s){
        while( lo >= 0 && hi < s.length() && s.charAt(lo) == s.charAt(hi)){
            st  = s.charAt(lo) + st + s.charAt(hi);
            lo--;
            hi++;
        }
        return st;
    }
    public String longestPalindrome(String s) {
        String ans = "";
        for(int i = 0 ; i < s.length() ; i++) {
            String s1 = expand("",i-1,i,s);
            String s2 = expand(s.charAt(i)+"", i - 1, i+1,s);
            if(ans.length() < s1.length()) {
                ans = s1;
            }
            if(ans.length() < s2.length()){
                ans = s2;
            }
        }
        return ans;
    }
}