class Solution {
    int[] expand(int lo, int hi,String s){
        while( lo >= 0 && hi < s.length() && s.charAt(lo) == s.charAt(hi)){
            lo--;
            hi++;
        }
        return new int[]{lo++,hi--};
    }
    public String longestPalindrome(String s) {
        int lo = 0;
        int hi = 0;
        for(int i = 0; i < s.length(); i++){
            int[] odd = expand(i,i,s);
            if(odd[1] - odd[0] > hi - lo){
                lo = odd[0];
                hi = odd[1];
            }

            if(i+1 < s.length() && s.charAt(i) == s.charAt(i+1)){
                int[] even = expand(i,i+1,s);
                if(even[1] - even[0] > hi - lo){
                    hi = even[1];
                    lo = even[0];
                }
            }
        }
        return s.substring(lo+1,hi);
    }
}