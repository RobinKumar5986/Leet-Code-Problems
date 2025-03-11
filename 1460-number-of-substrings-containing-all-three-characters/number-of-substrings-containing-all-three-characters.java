class Solution {
    public int numberOfSubstrings(String s) {
        int[] map = new int[3];
        int ans = 0;
        int lo = 0;
        int hi = 0;
        while(hi < s.length()){
            char c = s.charAt(hi);
            map[c - 'a']++;
            while(map[0] != 0 && map[1] != 0 && map[2] != 0){
                ans += s.length() - hi;
                char ch = s.charAt(lo);
                map[ch - 'a']--;
                lo++;
            }
            hi++;
        }
        return ans;
    }
}