class Solution {
    public String reverseVowels(String s) {
        Set<Character> map = Set.of('a', 'e', 'i', 'o', 'u','A','E','I','O','U'); 
        List<Integer> inds=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(map.contains(c))
                inds.add(i);
        }
        char[] ans=s.toCharArray();
        int lo=0;
        int hi=inds.size()-1;
        while(lo<hi){
            char c1=s.charAt( inds.get(lo) );
            char c2=s.charAt( inds.get(hi) );

            ans[inds.get(lo)]=c2;
            ans[inds.get(hi)]=c1;
            
            lo++;
            hi--;
        }
        return new String(ans);
    }
}