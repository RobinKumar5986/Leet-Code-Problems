class Solution {
    int[] map = new int[26];

    public int backTrack(){
        int res = 0;
        for(int i = 0 ; i < 26 ; i++){
            if(map[i] > 0){
                res +=1;
                map[i]--;
                res += backTrack();
                map[i]++;
            }
        }
        return res;
    }
    public int numTilePossibilities(String tiles) {
        for(char c : tiles.toCharArray())
            map[c - 'A']++;
        return backTrack();
    }
}