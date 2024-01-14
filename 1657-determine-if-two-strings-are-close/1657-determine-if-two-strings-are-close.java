class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()) return false;
        int[] map1=new int[26];
        int[] map2=new int[26];
        for(int i=0;i<word1.length();i++){
            char c1=word1.charAt(i);
            char c2=word2.charAt(i);
            map1[c1-'a']++;
            map2[c2-'a']++;
        }
        for(int i=0;i<26;i++)
            if( (map1[i]!=0 && map2[i]==0) || (map2[i]!=0 && map1[i]==0)) return false;
        Arrays.sort(map1);
        Arrays.sort(map2);
        for(int i=0;i<26;i++)
            if(map1[i]!=map2[i])return false;
        return true;

    }
}