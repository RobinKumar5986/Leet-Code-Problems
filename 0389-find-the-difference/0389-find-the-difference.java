class Solution {
    public char findTheDifference(String s, String t) {
        int freq1[]=new int[256];
        for(int i=0;i<s.length();i++){
            freq1[s.charAt(i) - 'a']+=1;
        }
        for(int i=0;i<t.length();i++){
            freq1[t.charAt(i) - 'a']-=1;
        }
        for(int i=0;i<256;i++){
            if(freq1[i]!=0)
            {
                int x=i+97;  //ascii value of 'a';
                return (char)x ;
            }
        }
        return 'e';

    }
}