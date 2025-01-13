class Solution {
    public int minimumLength(String s) {
        int[] map = new int[26];
        int ans = s.length();
        for(int c : s.toCharArray()){
            c = c - 'a';
            map[c]++;
            if(map[c] == 3) {
                map[c] = 1;
                ans -= 2;
            }
        }
        return ans;
    }
}