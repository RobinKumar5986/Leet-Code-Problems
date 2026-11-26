class Solution {
    boolean canEatAll(int[] banana, int k, int h) {
        int ind = banana.length-1;
        int time = 0;
        while(ind >= 0) {
            time += banana[ind]/k;
            if(banana[ind]%k != 0)time++;
            
            if(time > h)
                return false;
            
            ind--;
        }
        return true;
    }
    public int minEatingSpeed(int[] banana, int h) {
        int lo = 1;
        int hi = 0;
        for(int ele : banana) hi = Math.max(hi,ele);
        
        int ans = Integer.MAX_VALUE;

        while(lo <= hi){
            int mid = hi + (lo - hi )/2;
            if(canEatAll(banana,mid,h)) {
                ans = mid;
                hi = mid-1;   
            }else{
                lo = mid+1;
            }
        }

        return ans;
    }
}