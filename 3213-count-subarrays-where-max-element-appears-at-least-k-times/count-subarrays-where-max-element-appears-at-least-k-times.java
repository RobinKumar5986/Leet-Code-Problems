class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max = nums[0];
        for(int ele : nums)
            max = Math.max(ele,max);
        long ans = 0;
        int lo = 0;
        int hi = 0;
        while(hi < nums.length){
            if(nums[hi] == max)
                k--;
            while(k == 0){
                ans += nums.length - hi;
                if(nums[lo] == max)
                    k++;
                lo++;
            }
            hi++;
        }
        return ans;
    }
}