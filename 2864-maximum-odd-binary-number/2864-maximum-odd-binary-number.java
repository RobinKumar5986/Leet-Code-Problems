class Solution {
    public String maximumOddBinaryNumber(String s) {
        String ans="";
        int z=0;
        int o=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0')
                z++;
            else
                o++;
        }
        for(int i=0;i<z;i++)
            ans+="0";
        o--;
        ans+="1";
        while(o>0){
            ans="1"+ans;
            o--;
        }
        return ans;
    }
}