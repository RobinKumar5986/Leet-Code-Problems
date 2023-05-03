class Solution {
    public int characterReplacement(String s, int k) {
        // int l=0;
        // int r=0;
        // int len=0;
        // int wind=0;
        // int freq=0;

        // int n=s.length();

        // HashMap<Character,Integer> map=new HashMap<>();

        // while(r<n){
        //     char c=s.charAt(r);
        //     wind=r-l+1;
        //     map.put(c,map.getOrDefault(c,0)+1);
        //     if(map.get(c)>freq){
        //         freq=map.get(c);
        //     }
        //     int temp=wind-freq;
        //     if(temp<=k){
        //         len=wind;
        //     }else{
        //         map.put(s.charAt(l),map.get(s.charAt(l))-1);
        //         l++;
        //     }
        //     r++;
        // }
        // return len;

//-----------More Optmized Solution----------//

        int n=s.length();
        int len=0;
        int wind=0;
        int l=0;
        int freq=0;
        //mapping
        int[] map=new int[26];

        for(int r=0;r<n;r++){
            char c=s.charAt(r);
            map[c-'A']+=1;          //we can also write as map[c-'A']++;
            int temp=map[c-'A'];        //frequency of current element
            freq=Math.max(freq,temp);

            while(r - l + 1 -freq > k)  //if the overall frequency of the element is grater the the No. of allowed step 'k' just POP
            {
                map[s.charAt(l)-'A']--;
                l++;
            }
            
            len=Math.max(len,r-l+1); //setting the max length r - l + 1 is the window size 
        }
        return len;

    }
}