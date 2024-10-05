class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length() < s1.length()) return false;
        int[] map = new int[26];
        int[] wnd = new int[26];
        for(int i = 0 ;i<s1.length() ;i++){
            map[s1.charAt(i) -'a']++;
            wnd[s2.charAt(i) -'a']++;
        }
        if(Arrays.equals(map , wnd))
            return true;
        int lo = 0;
        int hi = s1.length();
        while(hi < s2.length()){
            char c1 = s2.charAt(lo);
            char c2 = s2.charAt(hi);
            wnd[c1 - 'a']--;
            wnd[c2 - 'a']++;
            if(Arrays.equals(map , wnd))
                return true;
            lo++;
            hi++;
        }
        return false;
    }
}