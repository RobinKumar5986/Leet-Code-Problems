class Solution {
    public int characterReplacement(String s, int k) {
        int l=0;
        int r=0;
        int len=0;
        int wind=0;
        int freq=0;

        int n=s.length();

        HashMap<Character,Integer> map=new HashMap<>();

        while(r<n){
            char c=s.charAt(r);
            wind=r-l+1;
            map.put(c,map.getOrDefault(c,0)+1);
            if(map.get(c)>freq){
                freq=map.get(c);
            }
            int temp=wind-freq;
            if(temp<=k){
                len=wind;
                wind++;
            }else{
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                l++;

            }
            r++;
        }
        return len;

    }
}