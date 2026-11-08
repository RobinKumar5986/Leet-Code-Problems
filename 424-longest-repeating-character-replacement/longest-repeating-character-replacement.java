class Solution {
    public int getMapFreq(int[] map) {
        int max = 0;
        for(int i = 0; i < map.length; i++){
            max = Math.max(map[i],max);
        }
        return max;
    }
    public int characterReplacement(String s, int k) {

        int[] map = new int[26];
        int maxFreq = 0;

        int lo = 0;
        int hi = 0;
        int ans = 0;
        while(hi < s.length() ){
            char c = s.charAt(hi);
            map[c-'A']++;
            maxFreq = Math.max(map[c-'A'] , maxFreq);
        

            //need to check we have enough flip for the remaning char
            int len = hi - lo + 1;
            // System.out.println(len + " : " + maxFreq + " : " + lo + " : "+ hi);
            if(len - maxFreq > k ){
                map[s.charAt(lo++) - 'A']--;
                maxFreq = getMapFreq(map);
                len = hi - lo + 1;
            }
            // System.out.println(len + " : " + maxFreq + " : " + lo + " : "+ hi);
            // System.out.println("-------------------------------");
            ans =  Math.max(hi - lo + 1, ans);
            hi++;
        }
        return ans;
        
    }
}