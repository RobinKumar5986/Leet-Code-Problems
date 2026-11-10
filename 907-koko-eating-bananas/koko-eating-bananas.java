class Solution {
    boolean canEatAll(int[] banana, int k, int h) {
        int ind = banana.length-1;
        int time = 0;
        while(ind >= 0) {
            if(banana[ind] <= k){
                time += 1;
            }else{
                int n = banana[ind]/k;
                if(banana[ind]%k != 0) n++;
                time += n;
            }
            // System.out.println(time + " : " + ind);
            if(time <= h && ind == 0){
                return true;
            }
            if(time > h)
                return false;
            
            ind--;
        }
        return false;
    }
    public int minEatingSpeed(int[] banana, int h) {
        Arrays.sort(banana);
        int lo = 1;
        int hi = banana[banana.length-1];
        int ans = Integer.MAX_VALUE;

        while(lo <= hi){
            int mid = hi + (lo - hi )/2;
            boolean canDo = canEatAll(banana,mid,h);
            // System.out.println(lo + " : " + hi + " : " + mid + " : " + canDo);
            // System.out.println("-------------------");
            if(canDo) {
                ans = mid;
                hi = mid-1;   
            }else{
                lo = mid+1;
            }
        }

        return ans;
    }
}