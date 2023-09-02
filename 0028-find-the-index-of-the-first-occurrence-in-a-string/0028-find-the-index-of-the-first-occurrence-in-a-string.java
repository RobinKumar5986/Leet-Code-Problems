class Solution {
    public int strStr(String haystack, String needle) {
        // if(haystack.length()< needle.length()) return -1;
    //-----------Brute Force Solution-------------//
        // int ans=-1;
        // for(int i=0;i<haystack.length();i++){
        //     if(haystack.charAt(i)==needle.charAt(0)){
        //         ans=i;
        //         int temp=i;
        //         for(int j=0;j<needle.length();j++){
        //             if(temp<haystack.length()){
        //                 if(needle.charAt(j)==haystack.charAt(temp)){
        //                     temp++;
        //                 }else{
        //                     ans=-1;
        //                 }
        //             }else{
        //                 ans=-1;
        //             }
        //         }
        //         if(ans!=-1) return ans;
        //     }

        // }
        // return ans;
    //-----------Bit Optmize Solution--------------//
        
    //     for(int i=0;i<=haystack.length()-needle.length();i++){
    //         if(haystack.charAt(i)==needle.charAt(0)){
    //             boolean found=true;
    //             for(int j=0;j<needle.length();j++){
    //                 if(haystack.charAt(j+i)!=needle.charAt(j)){ 
    //                     found=false; break;
    //                 }
    //             }
    //             if(found) return i;
    //         }
            
    //     }
    //     return -1;

    //----------Super Optmize Solution-----------------//
        return haystack.indexOf(needle);
    }
}