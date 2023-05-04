class Solution {
    public int countSubstrings(String s) {
        //------solution------//
        if(s.length()<=0) return 0;

        int start=0;
        int end=0;
        int c=0;
        for(int i=0;i<s.length();i++){
            int len1=expand(s,i,i+1);
            int len2=expand(s,i,i);
            c+=len1+len2;
        }
        return c;

    }
    public int expand(String s,int i,int j){
        int c=0;
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
            i--;
            j++;

           c++;
        }
        return c;
    }
}