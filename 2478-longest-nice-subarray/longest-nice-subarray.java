class Solution {
    public int longestNiceSubarray(int[] nums) {
        //all the set bit should be match and should be opposit 
        if(nums.length <= 1) return 1;
        int lo = 0;
        int hi = 1;
        int mask = nums[0];
        int ans = 1;
        while(hi < nums.length){
            while((mask & nums[hi]) != 0){
                mask ^= nums[lo];
                lo++;
            }
            mask |= nums[hi];
            ans = Math.max(ans,hi-lo+1);
            hi++; 
        }
        return ans;
    }
}