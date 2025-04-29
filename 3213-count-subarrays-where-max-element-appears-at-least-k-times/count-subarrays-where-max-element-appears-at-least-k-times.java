class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max = nums[0];
        for(int ele : nums)
            max = Math.max(ele,max);
        long ans = 0;
        int lo = 0;
        int hi = 0;
        int co = 0;
        while(hi < nums.length){
            if(nums[hi] == max)
                co++;
            while(k == co){
                ans += nums.length - hi;
                if(nums[lo] == max)
                    co--;
                lo++;
            }
            hi++;
        }
        return ans;
    }
}