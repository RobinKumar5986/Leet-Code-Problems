class Solution {
    int ans = 0;
    public int countPalindromicSubsequence(String s) {
        int first[] = new int[26];
        int last[] = new int[26];
        Arrays.fill(first,-1);
        
        for(int i = 0 ; i < s.length(); i++){
            char c = s.charAt(i);
            if(first[c - 'a'] == -1){
                first[c - 'a'] = i;
            }
            last[c - 'a'] = i;
        }
        //unique element b/w a range
        Map<Character,Integer> map = new HashMap<>();
        for(int c = 'a' ; c <='z' ; c++){
            int lo = first[c - 'a'] + 1;
            int hi = last[c - 'a'] - 1;
            
            Set<Character> set = new HashSet<>();
            for(int i = lo ; i <= hi ; i++){
                set.add(s.charAt(i));
            }
            map.put((char)c,set.size());
        }
        map.forEach((key,val) ->{
            ans += val;
        });
        return ans;
    }
}