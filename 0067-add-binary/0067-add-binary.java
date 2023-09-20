class Solution {
    public String addBinary(String a, String b) {
        String small , larg;
        if(a.length()==b.length() || a.length() < b.length() ){
          small=a;
          larg=b;
        }else{
          small=b;
          larg=a;
        }
        // System.out.println("small : "+small +" larg:"+larg);
       
        int temp=larg.length()-small.length();
        for(int i=0;i<temp;i++){
          small="0"+small;
        }
        // System.out.println("small : "+small +" larg:"+larg);
        char c='0';
        String ans="";
        for(int i=small.length()-1;i>=0 ;i--){
          char c1=small.charAt(i);
          char c2=larg.charAt(i);

          if(c=='0'&& c1=='0' && c2=='0'){
            ans="0"+ans;
            c='0';
          }
          if(c=='1'&& c1=='1' && c2=='1'){
            ans="1"+ans;
            c='1';

          }
          if((c=='0'&& c1=='0' && c2=='1') || (c=='0'&& c1=='1' && c2=='0') || (c=='1'&& c1=='0' && c2=='0') ){
            ans="1"+ans;
            c='0';
          }
          if((c=='0'&& c1=='1' && c2=='1') || (c=='1'&& c1=='1' && c2=='0') || (c=='1'&& c1=='0' && c2=='1') ){
            ans="0"+ans;
            c='1';
          }
        }
        if(c!='0') ans="1"+ans;
        return ans;
    }
}