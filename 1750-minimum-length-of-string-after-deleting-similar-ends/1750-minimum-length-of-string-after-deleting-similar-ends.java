class Solution {
    public int minimumLength(String s) {
        if(s.length()==1) return 1;

        int lo=0;
        int hi=s.length()-1;
        boolean flag=false;

        while(lo<hi){
            char pre=s.charAt(lo);
            if(s.charAt(lo)==s.charAt(hi)){
                flag=true;
                lo++;
                hi--;
                while(lo<hi){
                    if(s.charAt(lo)==pre)
                        lo++;
                    if(s.charAt(hi)==pre)
                        hi--;
                    if(s.charAt(lo)!=pre && s.charAt(hi)!=pre)
                        break;
                }
            }
            else
                break;
        }
        if(hi==lo && (s.charAt(lo-1)==s.charAt(lo) && s.charAt(lo) == s.charAt(lo+1) ) ){
            return 0;
        }
        return hi-lo+1;
    }
}