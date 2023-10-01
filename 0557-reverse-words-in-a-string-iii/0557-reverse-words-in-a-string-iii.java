class Solution {
    public String reverseWords(String s) {
        String ans="";
        int lo=0;
        int i=0; 
        for( i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                String temp=s.substring(lo,i);
                StringBuilder reversedWord = new StringBuilder(temp);
                ans+=reversedWord.reverse();
                lo=i+1;
                ans+=" ";
            }
        }
        String temp=s.substring(lo,i);
        StringBuilder reversedWord = new StringBuilder(temp);
        ans+=reversedWord.reverse();

        return ans;
    }
}