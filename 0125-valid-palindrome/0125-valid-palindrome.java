class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int low=0;
        int hi=s.length()-1;
        String s1="";
        String s2="";

        //Solution al=new Solution();

        while(low<s.length() || hi>=0){
            if(low<s.length() && alpha(s.charAt(low))){
                s1+=s.charAt(low);
               
            }
            if(hi>=0 && alpha(s.charAt(hi))){
                s2+=s.charAt(hi);
            }
            low++;
            hi--;
        }
        if(s1.equals(s2)) return true;
        return false;
    }
    public boolean alpha(char c){
        if((c>='a' && c<='z') || (c>='0' && c<='9')){
            return true;
        }
        return false;
    }
}