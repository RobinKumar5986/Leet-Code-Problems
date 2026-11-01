class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int lo = 0;
        int hi = 0;
        int sum = 0;
        int ans = Integer.MAX_VALUE;
        while(lo <= hi && hi < nums.length){
            sum += nums[hi];
            if(sum >= target){
                while(lo <= hi && sum >= target){
                    sum -= nums[lo];
                    ans = Math.min(ans,hi-lo+1);
                    lo++;
                }
            }
            hi++;
        }
        if(ans == Integer.MAX_VALUE)
            return 0;
        return ans;
        
    }
}