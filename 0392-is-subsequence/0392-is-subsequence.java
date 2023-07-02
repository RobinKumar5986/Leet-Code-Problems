class Solution {
    public boolean isSubsequence(String s, String t) {
        int count=0;
        Character c1= Character.MIN_VALUE;
        if(s.length()<=0) return true;

        for(int i=0;i<t.length();i++){
            if(count<s.length()){
             c1=s.charAt(count);
            }
            if(c1==t.charAt(i)){
                count++;
            }
        }
        if(count==s.length()){
            return true;
        }
        return false;

        
    }
}