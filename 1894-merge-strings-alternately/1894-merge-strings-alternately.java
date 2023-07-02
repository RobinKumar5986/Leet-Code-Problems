class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l1=word1.length();
        int l2=word2.length();
        int small;
        int flag=0;
        if(l1<=l2) {
            flag=2;
            if(l1==l2) flag=0;
            small=l1;
        }
        else {
            flag=1;
            small=l2;
        }

        String  s="";
        for(int i=0;i<small;i++){
            String one=""+word1.charAt(i);
            String two=""+word2.charAt(i);
            s+=one+two;
            //System.out.println("s is:"+s);
        }
        if(l1<l2){
            for(int i=l1;i<l2;i++){
                s+=""+word2.charAt(i);
            }
        }
        if(l1>l2){
            for(int i=l2;i<l1;i++){
                s+=""+word1.charAt(i);
            }
        }
        return s;
    }
}