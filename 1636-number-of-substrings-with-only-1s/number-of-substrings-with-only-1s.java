class Solution {
    public int numSub(String s) {
        int lo = -1;
        int hi = 0;
        long ans = 0;
        int mod = 1000_000_000 + 7;
        for(int  i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            if(c == '1'){
                if(lo == -1){
                    lo = i;
                    hi = i;
                }else{
                    hi++;
                }
            }else{
                if( lo != -1){
                    //getting the str len
                    long n = hi - lo + 1;
                    ans = (ans + (n * (n + 1) / 2) % mod) % mod;
                }
                lo = -1;
                hi = 0;
            }
        }
        if(lo != -1){
           //getting the str len
            long n = hi - lo + 1;
            ans = (ans + (n * (n + 1) / 2) % mod) % mod;
        }
        return (int)ans;
    }
}