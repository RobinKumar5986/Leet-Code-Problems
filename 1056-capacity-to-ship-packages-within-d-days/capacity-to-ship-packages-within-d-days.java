class Solution {
    boolean canShip(int[] weights,int days, int w){
        int day = 1;
        int sum = 0;
        for(int ele : weights){
            if(ele > w)
                return false;
            if(sum + ele > w){
                day++;
                sum = 0;
            }
            sum += ele;
            if(day > days)
                return false;
        }
        // System.out.println("days: " + day + " w: " + w);
        return true;
    }
    public int shipWithinDays(int[] weights, int days) {
        int lo = 1;
        int hi = 0;
        for (int w : weights) {
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