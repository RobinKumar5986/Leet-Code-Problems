class Solution {
    boolean isPref(String main,String pref){
        if(main.length() < pref.length())
            return false;
        for(int i = 0 ; i<main.length();i++){
            if(main.charAt(i) != pref.charAt(i))
                return false;
            if( i == pref.length()-1)
                return true;
        }
        return false;
    }
    public int prefixCount(String[] words, String pref) {
        int ans = 0;
        for(String ele : words){
            if(isPref(ele,pref))
                ans++;
        }
        return ans;
    }
}