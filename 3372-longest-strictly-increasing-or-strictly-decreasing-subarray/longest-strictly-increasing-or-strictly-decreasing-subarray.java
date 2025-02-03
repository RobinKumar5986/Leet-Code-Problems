class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int lo = 0;
        int hi = 0;
        int max = 1;
        while(hi < nums.length){
            if( hi > lo){
                if(nums[hi] > nums[hi-1]){
                    int len = hi-lo + 1;
                    max = Math.max(len, max);
                }else{
                    lo = hi;
                }
            }
            hi++;
            
        }
        lo = 0;
        hi = 0;
        while(hi < nums.length){
            if( hi > lo){
                if(nums[hi] < nums[hi-1]){
                    int len = hi-lo + 1;
                    max = Math.max(len, max);
                }else{
                    lo = hi;
                }
            }
            hi++;
            
        }
        return max;
    }
}