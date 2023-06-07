class Solution {
    public int lengthOfLongestSubstring(String s) {
    //------Optmized Solution O(2n) -----------//
        // Set<Character> set=new HashSet<>();
        // int n=s.length();
        // int r=0;
        // int l=0;
        // int len=0;

        // while(r<n){
        //     char c=s.charAt(r);

        //    if(!set.contains(c)){
        //       set.add(c);
        //       int temp=r-l+1;
        //       r++;
        //       if(temp>len) len=temp;
        //    }else{
        //        char c2=s.charAt(l);
        //        l++;
        //        set.remove(c2);
        //    }
        // }
        // return len;

        // HashMap<Character,Integer> map=new HashMap<>();
        // int n=s.length();
        // int r=0;
        // int l=0;
        // int len=0;

        // while(r<n){
        //     char c=s.charAt(r);
        //     if(map.containsKey(c)){
        //         l=Math.max(l,map.get(c)+1);
        //     }
        //     map.put(c,r);
        //     len=Math.max(len,r-l+1);
        //     r++;
        // }
        // return len;

        //--------Using array because it is faster then Hash map-------//
        int[] map=new int[257];
        int l=0;
        int r=0;
        int len=0;
        while(r<s.length()){
            char c=s.charAt(r);
            if(map[c]!=0){
                l=Math.max(l,map[c]);
            }
            len=Math.max(len,r-l+1);
            map[c]=r+1;
            r++;
            
        }

        return len;
    }
}