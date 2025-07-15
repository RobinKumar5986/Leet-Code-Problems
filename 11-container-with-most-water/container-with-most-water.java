class Solution {
    public int maxArea(int[] hig) {
        int maxW = 0;
        int lo = 0;
        int hi = hig.length-1;
        while(lo < hi){
            int w = Math.min(hig[lo], hig[hi]) * (hi - lo);
            maxW = Math.max(maxW,w);
            if(hig[lo] < hig[hi]){
                lo++;
            }else if(hig[hi] < hig[lo]){
                hi--;
            }else{
                lo++;
                hi--;
            }
        }
        return maxW;
    }
}