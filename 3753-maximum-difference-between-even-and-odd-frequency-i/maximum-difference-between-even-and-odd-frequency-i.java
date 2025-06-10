class Solution {
    public int maxDifference(String s) {
        int[] map = new int[26];
        for(char c : s.toCharArray())
            map[c - 'a']++;
        int ans = Integer.MIN_VALUE;
        for(int i = 0; i < 26 ; i++){
            for(int j = i+1; j < 26 ; j++){
                if(map[i] == 0 || map[j] == 0)
                    continue;
                if(map[i]%2 == 0 && map[j]%2 == 0)
                    continue;
                if(map[i]%2 != 0 && map[j]%2 != 0)
                    continue;
                Integer odd = null;
                Integer even = null;
                if(map[i] % 2 == 0){
                    even = map[i];
                    odd = map[j];
                }else{
                    even = map[j];
                    odd = map[i];
                }
            
                int diff = odd - even;
                ans = Math.max(ans, diff);
            }
        }
        return ans;

    }
}