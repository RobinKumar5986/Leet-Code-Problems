class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder s1=new StringBuilder();
        StringBuilder s2=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='#'){
                if(s1.length()!=0){
                    s1.deleteCharAt(s1.length()-1);
                }
            }else{
                s1.append(c);
            }
        }
        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            if(c=='#'){
                if(s2.length()!=0){
                    s2.deleteCharAt(s2.length()-1);
                }
            }else{
                s2.append(c);
            }
        }
        System.out.println(s1+" : "+s2);
        if(s1.toString().equals(s2.toString())) return true;
        else return false;

    }
}