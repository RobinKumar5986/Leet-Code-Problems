class Solution {
    boolean canShip(int[] weights,int days, int w){
        int day = 1;
        int sum = 0;
        for(int ele : weights){
            if(sum + ele > w){
                day++;
                sum = 0;
            }
            sum += ele;
            if(day > days)
                return false;
        }
        return true;
    }
    public int shipWithinDays(int[] weights, int days) {
        int lo = 1;
        int hi = 0;
        for (int w : weights) {
            lo = Math.max(lo,w);
            hi += w;
        }
        int ans = Integer.MAX_VALUE; // minimize the ans

        while( lo <= hi){
            int mid = hi + (lo - hi)/2;
            boolean canShip = canShip(weights,days,mid);
            if(canShip){
                ans = mid;
                hi = mid-1;
            }else{
                lo = mid + 1;
            }
        }
        return ans;
    }
}