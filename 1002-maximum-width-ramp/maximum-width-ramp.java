class Solution {
    public int maxWidthRamp(int[] nums) {
        int[] next = new int[nums.length];
        int max = Integer.MIN_VALUE;
        for(int i = nums.length - 1; i>=0; i--){
            next[i] = max;
            if(nums[i] > max)
                max = nums[i];
        }
        int lo = 0;
        int hi = 1;
        int ans = 0;
        while( hi < nums.length){
            if(nums[lo] <= nums[hi]){
                int ramp = hi - lo;
                if(ramp > ans)
                    ans = ramp; 
            }
            //can expand
            if(next[hi] >= nums[lo]){
                hi++;
            }else{
                lo++;
                if(lo == hi){
                    hi++;
                }
            }
        }
        return ans;
    }
}