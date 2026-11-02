class Solution {
    public boolean isSame(int[] seen, int[] cur){
        for(int i = 0 ; i < 256 ; i++){
            if(seen[i] > 0 ){
                if(cur[i] < seen[i])
                    return false;
            }
        }
        return true;
    }

    public String minWindow(String s, String t) {
        int[] seen = new int[256];
        for(char c : t.toCharArray()){
            seen[c]++;
        }

        int lo = 0;
        int hi = 0;
        int[] cur = new int[256];
        int ans = Integer.MAX_VALUE;
        int blo = -1;
        int bhi = -1;
        while( lo <= hi && hi < s.length()){
            char c = s.charAt(hi);
            cur[c]++;
            
            if(isSame(seen,cur)) { 
                //found the string now need to shrink the string to get minimum
                while(lo <= hi ){
                    int diff = hi - lo +1;
                    if( diff < ans) {
                        ans = diff;
                        blo = lo;
                        bhi = hi;
                    }
                    char ch = s.charAt(lo);
                    cur[ch]--;
                    lo++;
                    if(seen[ch] > 0 && cur[ch] < seen[ch]){
                        break;
                    }
                }
                
            }
            hi++;
        }
        return ans == Integer.MAX_VALUE ? "" : s.substring(blo,bhi+1);

    }
}