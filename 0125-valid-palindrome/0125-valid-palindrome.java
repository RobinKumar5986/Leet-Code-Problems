class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int low=0;
        int hi=s.length()-1;
        String s1="";
        String s2="";

        Solution al=new Solution();

        while(low<s.length() || hi>=0){
            if(low<s.length() && al.alpha(s.charAt(low))==true){
                s1+=s.charAt(low);
               
            }
            if(hi>=0 && al.alpha(s.charAt(hi))==true){
                s2+=s.charAt(hi);
            }
            low++;
            hi--;
        }
        System.out.println(s1+ " "+ s2);

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