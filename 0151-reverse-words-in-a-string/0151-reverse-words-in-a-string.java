class Solution {
    
    public String reverseWords(String s) {
       String ans="";
       int lo=0;
       int hi=0;
       boolean found=false;
       for(int i=0;i<s.length();i++){
           if(s.charAt(i)!=' ' && found==false){
               lo=i;
               found=true;
           }
           if(s.charAt(i)==' '&& found==true){
               hi=i;
               if(ans=="") 
                    ans=s.substring(lo,hi);
               else
                    ans=s.substring(lo,hi)+" "+ans;
                    
               found = false;
           }
       }
        if(found){
             if(ans=="") 
                ans=s.substring(lo,s.length());
            else
                ans=s.substring(lo,s.length())+" "+ans;
        }
        
        return ans;
    }
}