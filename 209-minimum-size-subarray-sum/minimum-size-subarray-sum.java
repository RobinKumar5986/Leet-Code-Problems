class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int lo = 0;
        int hi = 0;
        int sum = 0;
        int ans = Integer.MAX_VALUE;
        while( hi < nums.length) {
            sum += nums[hi];
            while(sum >= target) {
                ans = Math.min( hi - lo + 1, ans);
                sum -= nums[lo++];
            }
            hi++;
        }
        if(ans == Integer.MAX_VALUE)
            return 0;
        return ans;
    }
}