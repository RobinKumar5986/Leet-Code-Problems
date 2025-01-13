class Solution {
    public int minimumLength(String s) {
        int[] map = new int[26];
        for(int c : s.toCharArray()){
            c = c - 'a';
            map[c]++;
            if(map[c] == 3) map[c] = 1;
        }
        int ans = 0;
        for(int ele : map)
            ans+= ele;
        return ans;
    }
}