class Solution {
    public int searchInsert(int[] nums, int target) {
        int mid=0;
        int lo=0;
        int hi=nums.length-1;
        while(lo<=hi){
            mid=(lo+hi)/2;
            if(nums[mid]==target)
                return mid;
            if(nums[mid]<target){
                lo=mid+1;
            }
            if(nums[mid]>target){
                hi=mid-1;
            }
        }
        return lo;
    }
}