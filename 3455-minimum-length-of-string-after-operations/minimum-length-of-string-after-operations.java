class Solution {
    public int minimumLength(String s) {
        int[] map = new int[26];
        int ans = s.length();
        for(byte c : s.getBytes()){
            byte b =(byte)(c - 'a');
            map[b]++;
            if(map[b] == 3) {
                map[b] = 1;
                ans -= 2;
            }
        }
        return ans;
    }
}