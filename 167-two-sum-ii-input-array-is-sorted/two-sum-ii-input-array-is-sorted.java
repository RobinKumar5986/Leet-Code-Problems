class Solution {
    public int[] twoSum(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length-1;
        //lets try to solve this in simple way first
        while(lo < hi){
            if(nums[lo] + nums[hi] == target){
                return new int[]{lo+1,hi+1};
            }
            else if(nums[lo] + nums[hi] < target){
                lo++;
            }else{
                hi--;
            }
        }
        return new int[]{-1,-1};
    }
}