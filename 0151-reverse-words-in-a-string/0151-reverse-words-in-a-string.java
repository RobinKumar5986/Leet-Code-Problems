class Solution {
    
    public String reverseWords(String s) {
        String ans="";
        String temp="";
        for(int i=s.length()-1 ;i>=0 ;i--){
            if(s.charAt(i)!=' '){
                temp=s.charAt(i)+temp;
            }else{
                if(temp!=""){
                    if(ans=="")
                        ans=ans+temp;
                    else
                        ans=ans+" "+temp;
                    temp="";
                }
            }
        }
        if(temp!="") {
           if(ans=="")
                ans=ans+temp;
            else
                ans=ans+" "+temp;
            temp="";
        }
        return ans;
    }
}