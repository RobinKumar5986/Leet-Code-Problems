class Solution {
    boolean isMatch(int ind,String s, String g){
        for(int i = 0 ; i < s.length(); i++,ind++){
            ind = ind % s.length();
            if(g.charAt(i) != s.charAt(ind))
                return false;
        }
        return true;
    }
    public boolean rotateString(String s, String g) {
        if(s.length() != g.length())
            return false;
        for(int i = 0 ; i < s.length() ; i++){
            if(isMatch(i,s,g))
                return true;
        }
        return false;
    }
}