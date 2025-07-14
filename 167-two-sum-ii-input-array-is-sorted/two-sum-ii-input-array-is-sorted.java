class Solution {
    public int[] twoSum(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length-1;
        //binary serach approch wont work here because as we cut the arr in half we might lose the potential 
        //solution because it only checkes the extreams.
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