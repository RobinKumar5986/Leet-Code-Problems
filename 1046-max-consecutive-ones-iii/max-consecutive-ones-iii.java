class Solution {
    public int longestOnes(int[] nums, int k) {
        int lo = 0;
        int hi = 0;
        int ans = 0;
        while( hi < nums.length) {
            if(nums[hi] == 0){
                while(k == 0){
                    if(nums[lo] == 0)
                        k++;
                    lo++;
                }
                k--;
            }
            ans = Math.max(ans,hi-lo+1);
            hi++;
        }
        return ans;
    }
}