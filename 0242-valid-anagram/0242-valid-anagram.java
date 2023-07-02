class Solution {
    public boolean isAnagram(String s, String t) {
//---------Brute Force Using Mapping---------//
        if(s.length()!=t.length() || s.length()<1) return false;
        int[] flag=new int[256];

        for(int i=0; i<s.length() ;i++){
            flag[s.charAt(i)]+=1;
            flag[t.charAt(i)]-=1;
        }

        for(int i=0;i<256 ;i++){
            if(flag[i]!=0) return false;
        }
        return true;
    }
}