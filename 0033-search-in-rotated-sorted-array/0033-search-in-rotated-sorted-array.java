class Solution {
    public int search(int[] nums, int target) {
        int hi=nums.length-1;
        int lo=0;

        while(lo<=hi){
            int mid=(hi+lo)/2;
            if(nums[mid]==target) return mid;
            else if(nums[lo]<=nums[mid] && target>=nums[lo] && target<nums[mid])
                hi=mid-1;
            else if(nums[mid]<=nums[hi] && target>nums[mid] && target<=nums[hi])
                lo=mid+1;
            else if(nums[lo]>nums[mid] && (target >=nums[lo] || target<nums[mid]))
                hi=mid-1;
            else
                lo=mid+1;
        }
        return -1;
    }
}