class Solution {
    public int lengthOfLongestSubstring(String s) {
        boolean[] map = new boolean[256];

        int lo = 0;
        int hi = 0;
        int ans = 0;
        while(lo <= hi && hi < s.length()){
            char c = s.charAt(hi);
            if(map[c]){
                while(map[c]){
                    char ch = s.charAt(lo);
                    map[ch] = false;
                    lo++;
                }
            }else{
                ans = Math.max(ans, hi-lo+1);
            }
            map[c] = true;
            hi++;
        }
        return ans;
        
    }
}