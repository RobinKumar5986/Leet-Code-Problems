class Solution {
    public int minSteps(String s, String t) {
        if(s.length()!=t.length()) return -1;
        char[] map1=new char[26];
        char[] map2=new char[26];
        for(int i=0;i<s.length();i++){
            map1[s.charAt(i) - 'a']++;
            map2[t.charAt(i) - 'a']++;
        }
        int step=0;
        for(int i=0;i<26;i++){
            if(map1[i]!=map2[i])
                step+=Math.abs(map1[i]-map2[i]);
        }
        return step/2;
    }
}