class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2))
            return true;
        int[] m1 = new int[26];
        int[] m2 = new int[26];
        for(int i = 0; i < s1.length(); i++){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if(c1 != c2){
                m1[c1 - 'a']++;
                m2[c2 - 'a']++;
            }
        }
        int c = 0;
        for(int i = 0; i<26 ;i++){
            if(m1[i] > 1 || m2[i] > 1)
                return false;
            if(m1[i] != m2[i])
                return false;
            if(m1[i] != 0){
                c++;
            }
        }
        if(c >= 3)
            return false; 
        return true;
    }
}