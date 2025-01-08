class Solution {
    boolean isPreASuf(String s1 , String s2){
        if(s1.length() > s2.length())
            return false;
        int lo = 0;
        int hi = s2.length()-1;
        while(lo < s1.length()){
            char c = s1.charAt(lo);
            char c2 = s1.charAt(s1.length() - lo - 1);
            if(c != s2.charAt(lo) || c2 != s2.charAt(hi))
                return false;
            lo++;
            hi--;
        }
        return true;
    }
    public int countPrefixSuffixPairs(String[] words) {
        int ans = 0;
        for(int i = 0 ; i < words.length ; i++){
            for(int j = i+1 ; j< words.length ; j++){
                if(isPreASuf(words[i] , words[j])){
                    ans++;
                }
            }
        }
        return ans;
    }
}