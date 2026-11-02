class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        for(int i = 0 ; i < nums.length; i++){
            nums[i] = nums[i]%2;
        }
        int lo = 0;
        int hi = 0;
        int sum = 0;
        int ans = 0;
        int lead = 0;
        while( hi < nums.length){
            sum += nums[hi];
            if(nums[hi] == 1)
                lead = 0;
            while(sum == k){
                sum -= nums[lo];
                lo++;
                lead++;
            }
            ans += lead;
            hi++;
        }
        return ans;

    }
}