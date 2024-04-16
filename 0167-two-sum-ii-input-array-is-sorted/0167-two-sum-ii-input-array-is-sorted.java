class Solution {
    public int[] twoSum(int[] nums, int target) {
        int lo=0;
        int hi=nums.length-1;
        int[] ans=new int[2];
        while(lo<hi){
            if(nums[lo] + nums[hi]==target)
            {
                ans[0]=lo+1;
                ans[1]=hi+1;
                return ans;
            }
            if(nums[lo]+nums[hi] > target)
                hi--;
            else
                lo++;
        }
        return ans;
    }
}