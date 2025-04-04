class Solution {
    public long maximumTripletValue(int[] nums) {
        int preMax[] = new int[nums.length];
        int nextMax[] = new int[nums.length];

        preMax[0] = nums[0];
        nextMax[nums.length-1] = nums[nums.length-1];

        for(int i = 1; i<nums.length;i++){
            preMax[i] = Math.max(nums[i],preMax[i-1]);
        }
        for(int i = nums.length-2; i >= 0 ; i--){
            nextMax[i] = Math.max(nums[i],nextMax[i+1]);
        }
        long ans = 0;
        for(int i = 1; i < nums.length-1; i++){
            long val = (preMax[i-1] - nums[i] ) * (long)nextMax[i+1];
            ans = Math.max(val,ans);
        }
        return ans;
    }
}