class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        int[] S = new int[26];
        int[] T = new int[26];
        for(int i = 0 ; i < s.length() ; i++){
            S[s.charAt(i) - 'a']++;
            T[t.charAt(i) - 'a']++;
        }
        for(int i = 0 ; i < 26 ; i++){
            if(S[i] != T[i])
                return false;
        }
        return true;
    }
}