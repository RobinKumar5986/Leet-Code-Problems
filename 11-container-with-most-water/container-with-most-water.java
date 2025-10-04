class Solution {
    public int maxArea(int[] hig) {
        int lo = 0;
        int hi = hig.length-1;
        int ans = 0;
        while(lo < hi){
            int dis = hi - lo;
            int water = dis * Math.min(hig[lo] , hig[hi]);
            ans = Math.max(water,ans);
            if(hig[lo] < hig[hi]){
                lo++;
            }else{
                hi--;
            }
        }
        return ans;
    }
}