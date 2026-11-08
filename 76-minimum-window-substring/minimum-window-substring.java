class Solution {
    boolean isSame(int[] main ,int[] cur) {
        for(int i = 0 ; i < cur.length; i++){
            if(cur[i] < main[i])
                return false;
        }
        return true;
    }
    public String minWindow(String s, String t) {
        int[] main = new int[128];
        int[] cur = new int[128];

        Arrays.fill(main,-1);
        Arrays.fill(cur,-1);


        int lo = 0;
        int hi = 0;

        int mainLen = Integer.MAX_VALUE;
        int minLo = 0;
        int minHi = 0;
        for(char c : t.toCharArray()) {
            main[c]++;
        }

        while(hi < s.length()){
            char c = s.charAt(hi);
            cur[c]++;
            while(isSame(main,cur)){
                int len = hi - lo + 1;
                if(len < mainLen) {
                    mainLen = len;
                    minLo = lo;
                    minHi = hi+1;
                }
                char ch = s.charAt(lo);
                cur[ch]--;
                lo++;
            }
            hi++;
        }
        return s.substring(minLo,minHi);
    }
}