class Solution {
    boolean isPrefix(String s1, String s2, String pre){
        if(pre.length() > s1.length() || pre.length() > s2.length())
            return false;
        if(s1.length() % pre.length() != 0 || s2.length() % pre.length() != 0)
            return false;

        for(int i = 0; i < s1.length() ; i++){
            for(int j = 0; j < pre.length() ; j++,i++){
                if(s1.charAt(i) != pre.charAt(j))
                    return false;
            }
            i--;
        }
        for(int i = 0; i < s2.length() ; i++){
            for(int j = 0; j < pre.length() ; j++,i++){
                if(s2.charAt(i) != pre.charAt(j))
                    return false;
            }
            i--;
        }
        return true;
    }
    public String gcdOfStrings(String s1, String s2) {
        String candi = "";
        if(s1.length() < s2.length())
            candi = s1;
        else
            candi = s2;
        String current = "";
        String ans = "";
        for(int i = 0; i<candi.length() ; i++){
            current += candi.charAt(i);
            if(isPrefix(s1,s2,current)){
                ans = current;
            }
        }
        return ans;
    }
}