class Solution {
    int expand(int lo, int hi, String s){
        int co = 1;
        while(lo >= 0 && hi < s.length() && s.charAt(lo) == s.charAt(hi)){
            co++;
            lo--;
            hi++;
        }
        return co;
    }
    public int countSubstrings(String s) {
        int ans = 0;
        for(int i = 0 ; i < s.length(); i++){
            ans += expand(i-1,i,s);
            ans += expand(i-1,i+1,s);
            ans -= 1;
        }
        return ans;
    }
}