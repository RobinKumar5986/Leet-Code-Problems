class Solution {
    public char nextGreatestLetter(char[] l, char t) {
        // if(letters[letters.length-1]<=target) return letters[0];

        // for(int i=0;i<letters.length;i++){
        //     if(letters[i]>target){
        //         return letters[i];
        //     }
        // }
        // return 'a'; //just a dummy return statement this condition is never going to come 


        //-----Binary Serch  method-----//
        if(l [ l.length-1]<=t ) return l[0];
        int lo=0;
        int hi=l.length-1;
        char c=l[0];
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(l[mid]>t){
                c=l[mid];
                hi=mid-1;
            }
            if(l[mid]==t){
                lo=mid+1;
            }
            if(l[mid]<t){
                lo=mid+1;
            }
        }
        return c;

    }
}