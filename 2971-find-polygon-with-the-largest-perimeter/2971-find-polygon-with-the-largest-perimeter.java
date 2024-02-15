class Solution {
    public long largestPerimeter(int[] nums) {
        if(nums.length<=2) return -1;
        Arrays.sort(nums);
        long ans=0;
        long sum=nums[0]+nums[1];
        for(int i=2;i<nums.length;i++){
            if(sum>nums[i]){
                ans=Math.max(sum+nums[i],ans);
            }
            sum+=nums[i];
        }
        return (ans==0) ? -1 : ans;
    }
}