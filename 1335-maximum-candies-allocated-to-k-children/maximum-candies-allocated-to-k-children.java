class Solution {
    boolean helper(int[] candies, long k ,long pile){
        if(pile == 0 ) return false;
        long count = 0;
        for(int ele : candies){
            count += ele / pile;
            if(count >= k)
                return true;
        }
        return false;
    }
    public int maximumCandies(int[] candies, long k) {
        long sum = 0;
        for(int ele : candies)
            sum += ele;
        long lo = 1;
        long hi = sum / k;
        int ans = 0;
        while(lo <= hi){
            long mid = lo + (hi - lo) / 2; 
            if(helper(candies,k,mid)){
                lo = mid+1;
                ans = (int)mid;
            }else{
                hi = mid-1;
            }
        }
        return ans;
    }
}