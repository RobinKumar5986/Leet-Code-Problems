class Solution {
    long helper(int[] ranks, long time) {  
        long total = 0; 
        for (int ele : ranks) {
            total += (long) Math.sqrt(time / (double) ele);
        }
        return total;
    }
    public long repairCars(int[] ranks, int cars) {
        int min = Integer.MAX_VALUE;
        for(int ele : ranks)
            min = Math.min(ele,min);
        long lo = 1l;
        long hi = (long)min * cars * cars;
        long ans = 0;
        while(lo <= hi){
            long mid = lo + (hi - lo)/2;
            long total = helper(ranks,mid);
            if(total >= cars){
                ans = mid;
                hi = mid - 1;
            }else{
                lo = mid+1;
            }
        }
        return ans;
    }
}