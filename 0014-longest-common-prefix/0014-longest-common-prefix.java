class Solution {
    public String longestCommonPrefix(String[] strs) {
//------------Brute Force----------------//
        // if(str.length<=0) return "";

        // String s=str[0];

        // for(int i=1;i<str.length;i++){

        //     int n1=s.length();
        //     int n2=str[i].length();
        //     int min=(n1<n2) ? n1 :n2;
        //     String temp="";
        //     for(int j=0;j<min;j++){
        //         char c1=s.charAt(j);
        //         char c2=str[i].charAt(j);
        //         if(c1==c2) temp+=c1;
        //         else{
        //             break;
        //         }
        //     }

        //     if(temp.length()<=n1){
        //         s=temp;
        //     }
        // }
        // return s;

//--------Optmizeed Solution---------//
       if (strs == null || strs.length == 0)
            return "";
        
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int c = 0;
        while(c < first.length())
        {
            if (first.charAt(c) == last.charAt(c))
                c++;
            else
                break;
        }
        return c == 0 ? "" : first.substring(0, c);
    }
}