class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length() ) return false;

        int[] m1=new int[26];
        int[] m2=new int[26];
        for(int i=0;i<s.length() ; i++){
            m1[s.charAt(i) - 'a']++;
            m2[t.charAt(i) - 'a']++;
        }
        if( Arrays.equals(m1,m2) ) return true;
        return false;
    }
}