class Solution {
    public int minimumLength(String s) {
        int[] map = new int[26];
        int ans = s.length();
        for(byte c : s.getBytes()){
            map[c-'a']++;
            if(map[c-'a'] == 3) {
                map[c-'a'] = 1;
                ans -= 2;
            }
        }
        return ans;
    }
}