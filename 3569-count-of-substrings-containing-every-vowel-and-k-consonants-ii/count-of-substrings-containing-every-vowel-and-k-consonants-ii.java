class Solution {
    long helper(String word, int k){
        Map<Character,Integer> map = new HashMap<>();
        map.put('a',0);
        map.put('e',0);
        map.put('i',0);
        map.put('o',0);
        map.put('u',0);

        int lo = 0;
        int hi = 0;
        int vC = 0;
        int kC = 0;
        long res = 0;
        while(hi < word.length()){
            char c = word.charAt(hi);
            if(map.containsKey(c)){
                if(map.get(c) == 0)
                    vC++;
                map.put(c,map.get(c) + 1);
            }else{
                kC++;
            }
            while(vC == 5 && kC >= k){
                res += word.length() - hi;
                char ch = word.charAt(lo);
                if(map.containsKey(ch)){
                    if(map.get(ch) == 1){
                        vC--;
                    }
                    map.put(ch,map.get(ch)-1);
                }else{
                    kC--;
                }
                lo++;
            }
            hi++;
        }
        return res;

    }
    public long countOfSubstrings(String word, int k) {
        long c1 = helper(word,k);
        long c2 = helper(word,k+1);
        
        return c1 - c2;
        
    }
}