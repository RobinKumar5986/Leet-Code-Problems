class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int lo = 0;
        int hi = s.length() - 1;
        //lets do this in but complex way but it will be more time efficient and one pass sol
        //insted of two pass solution 
        while( lo < hi ){
            while(lo < s.length() && (s.charAt(lo) < 'a' || s.charAt(lo) > 'z') && (s.charAt(lo) < '0' || s.charAt(lo) > '9')){
                lo++;
            }
            if(lo >= s.length())
                return true;
            while(hi >= 0 && (s.charAt(hi) < 'a' || s.charAt(hi) > 'z') && (s.charAt(hi) < '0' || s.charAt(hi) > '9')){
                hi--;
            }
            if(hi < 0)
                return true;
            if(s.charAt(lo) != s.charAt(hi))
                return false;
            lo++;
            hi--;
        }
        return true;
    }
}