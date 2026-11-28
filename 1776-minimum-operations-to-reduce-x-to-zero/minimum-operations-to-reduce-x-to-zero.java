class Solution {
    public int minOperations(int[] nums, int x) {
        int lo = 0;
        int hi = 0;
        int sum = 0;
        for(int ele : nums)
            sum += ele;
        int req = sum - x;
        sum = 0;
        int ans = Integer.MAX_VALUE;
        while( hi < nums.length){
            sum += nums[hi];
            while(sum > req && lo <= hi){
                sum -= nums[lo];
                lo++;
            }
            if(sum == req){
                int win = nums.length - (hi-lo+1);
                ans = Math.min(win,ans);
            }
            hi++;
        }
        if(ans == Integer.MAX_VALUE)
            return -1;
        return ans;
    }
}