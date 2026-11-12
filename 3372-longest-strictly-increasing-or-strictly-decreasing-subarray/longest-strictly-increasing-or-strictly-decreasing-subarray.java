class Solution {
    public int longestMonotonicSubarray(int[] nums) {

        int lo1 = 0;
        int lo2 = 0;
        int hi = 1;
        int ans = 1;

        while( hi < nums.length) {
            if(hi > 0){
                if(nums[hi-1] >= nums[hi]){ //strictlly increasing
                    ans = Math.max(ans,hi-lo1);
                    lo1 = hi;
                }

                if(nums[hi-1] <= nums[hi]){
                    ans = Math.max(ans, hi-lo2);
                    lo2 = hi;
                }
                
            }
            hi++;
        }
        
        ans = Math.max(ans,hi-lo1);
        ans = Math.max(ans,hi-lo2);
        return ans;

        
    }
}