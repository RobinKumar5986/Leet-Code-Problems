class Solution {
    public int waysToSplitArray(int[] nums) {
        long sum = 0;
        for(int ele : nums)
            sum += ele;
        long cur = 0;
        int ans = 0;
        for(int i = 0 ; i < nums.length-1 ; i++){
            cur += (long)nums[i];
            if(cur >= (sum - cur))
                ans++;
        }
        return ans;
    }
}