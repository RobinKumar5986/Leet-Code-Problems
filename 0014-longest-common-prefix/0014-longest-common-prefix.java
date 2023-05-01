class Solution {
    public String longestCommonPrefix(String[] str) {
        if(str.length<=0) return "";

        String s=str[0];

        for(int i=1;i<str.length;i++){

            int n1=s.length();
            int n2=str[i].length();
            int min=(n1<n2) ? n1 :n2;
            String temp="";


            for(int j=0;j<min;j++){
                char c1=s.charAt(j);
                char c2=str[i].charAt(j);
                System.out.println("c1 : " + c1 );
                System.out.println("c2 : " + c2);
                if(c1==c2) temp+=c1;
                else{
                    break;
                }
            }


            // System.out.println("temp : " + temp );
            // System.out.println("Pre FIX : " + s);
            if(temp.length()<=n1){
                s=temp;
            }
        }
        // System.out.println("Pre FIX : " + s);

        return s;
    }
}