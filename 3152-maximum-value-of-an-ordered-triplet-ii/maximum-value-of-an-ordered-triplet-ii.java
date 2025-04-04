class Solution {
    public long maximumTripletValue(int[] nums) {
        int preMax[] = new int[nums.length];
        int nextMax[] = new int[nums.length];

        preMax[0] = nums[0];
        nextMax[nums.length-1] = nums[nums.length-1];

        int n = nums.length;
        for (int i = 1; i < n; i++) {
            preMax[i] = Math.max(nums[i], preMax[i - 1]);
            nextMax[n - 1 - i] = Math.max(nums[n - 1 - i], nextMax[n - i]);
        }

        long ans = 0;
        for(int i = 1; i < nums.length-1; i++){
            long val = (preMax[i-1] - nums[i] ) * (long)nextMax[i+1];
            ans = Math.max(val,ans);
        }
        return ans;
    }
}