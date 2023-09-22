class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()>t.length()) return false;
        if(s.length()<=0) return true;

        int count=0;
        char c2=Character.MIN_VALUE;
        for(int i=0;i<t.length();i++){
            char c1=t.charAt(i);
            if(count<s.length() ){
                c2=s.charAt(count);
            }
            if(c1==c2){
                count++;
            }
        }
        if(count==s.length()) return true;

        return false;
    }
}