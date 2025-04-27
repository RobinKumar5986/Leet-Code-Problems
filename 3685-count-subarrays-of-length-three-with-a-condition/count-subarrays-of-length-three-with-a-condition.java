class Solution {
    public int countSubarrays(int[] nums) {
        int lo = 0;
        int hi = 2;
        int ans = 0;
        while( hi < nums.length){
            int mid = nums[lo+1]/2;
            if(nums[lo+1]%2 != 0){
                lo++;
                hi++;
                continue;
            }
            if(nums[lo] + nums[hi] == mid)
                ans++;
            lo++;
            hi++;
        }
        return ans;
    }
}