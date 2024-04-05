class Solution {
    public String makeGood(String s) {
       while(true){
        boolean flag=true;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1) + 32 || s.charAt(i)+32 == s.charAt(i+1) ){
                flag=false;
                String s1=s.substring(0,i);
                String s2="";
                if(i+2<s.length())
                    s2=s.substring(i+2);
                s=s1+s2;
            }
        }
        if(flag)
            return s;
       }
    }
}