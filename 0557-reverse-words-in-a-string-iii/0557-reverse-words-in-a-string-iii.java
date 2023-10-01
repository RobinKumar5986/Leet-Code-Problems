class Solution {
    public String reverse(String temp){
        String rev="";
        for(int i=temp.length()-1;i>=0 ;i--){
            rev+=temp.charAt(i);
        }
        return rev;
    }
    public String reverseWords(String s) {
        String ans="";
        int lo=0;
        int i=0; 
        for( i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                ans+=reverse( s.substring(lo,i) );
                lo=i+1;
                ans+=" ";
            }
        }
        if(lo!=i){
            ans+=reverse( s.substring(lo,i) );
        }
        return ans;
    }
}