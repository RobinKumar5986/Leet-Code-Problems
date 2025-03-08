class Solution {
    public int minimumRecolors(String bk, int k) {
        int ans = 0;
        int co = 0;
        for(int i = 0; i<k;i++){
            if(bk.charAt(i) == 'W')
                co++;
        }
        ans = co;
        int lo = 1;
        int hi = k;
        while(hi < bk.length()){
            if(bk.charAt(lo-1) == 'W')
                co--;
            if(bk.charAt(hi) == 'W')
                co++;
            ans = co < ans ? co : ans;
            hi++;
            lo++;
        }
        return ans;
    }
}