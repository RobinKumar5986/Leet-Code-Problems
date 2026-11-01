class Solution {
    public String cleanStr(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9'))
                sb.append(c);
        }
        return sb.toString();
    }
    public boolean isPalindrome(String s) {
        s = cleanStr(s);
        int lo = 0;
        int hi = s.length()-1;

        while(lo < hi) {
            if(s.charAt(lo) != s.charAt(hi))
                return false;
            lo++;
            hi--;
        }
        return true;
    }
}