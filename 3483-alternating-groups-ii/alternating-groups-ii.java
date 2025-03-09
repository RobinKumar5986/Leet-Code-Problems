class Solution {
    public int numberOfAlternatingGroups(int[] col, int k) {
        int issue = -1;
        for(int i = 1; i < k; i++){
            if(col[i-1] == col[i])
                issue = i-1;
        }
        int ans = 0;
        if(issue == -1) ans++;

        int lo = 1;
        int hi = k;
        while(lo < col.length){
            hi = hi % col.length;
            int prev = hi -1;
            if(hi == 0){
                prev = col.length-1;
            }
            if(col[prev] == col[hi]){
                issue = prev;
            }
            if(issue == -1){
                ans++;
            }else{
                if( hi < lo){
                    if(issue >= hi && issue < lo)
                        ans++;
                }else{
                    if(issue < lo )
                        ans++;
                }
            }
            lo++;
            hi++;
        }
        return ans;
    }
}