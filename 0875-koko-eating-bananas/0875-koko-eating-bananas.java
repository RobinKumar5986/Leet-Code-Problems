class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        long lo=1;
        long hi=piles[piles.length-1];
        long ans=Integer.MAX_VALUE;
        long min=Integer.MAX_VALUE;
        while(lo<=hi){
            long mid=(lo+hi)/2;
            long hr=0;
            for(int i=0;i<piles.length;i++){
                hr+=(long) Math.ceil((double) piles[i] / mid);
            }
            if(hr<=h && mid<=ans){
                min=hr;
                ans=mid;
            }
            if(hr>h){
                lo=mid+1;
            }else{
                hi=mid-1;
            }
        }
        return (int)ans;
    }
}