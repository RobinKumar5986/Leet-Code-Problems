class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        int[] sar = new int[26];
        int[] tar = new int[26];

        for(int i = 0; i < s.length(); i++){
            sar[s.charAt(i) - 'a']++;
            tar[t.charAt(i) - 'a']++;
        }

        for(int i = 0 ; i < 26; i++){
            if(sar[i] != tar[i])
                return false;
        }
        return true;
    }
}