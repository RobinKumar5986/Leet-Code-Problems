class Solution {
    public int findMin(int[] nums) {
        int lo = 0;
        int hi = nums.length -1;
        if(nums[lo] <= nums[hi])
            return nums[lo];
        
        int min = Integer.MAX_VALUE;
        while(lo <= hi){
            int mid =(hi+lo)/2;
            min = Math.min(min,nums[mid]);

            if(nums[mid] > nums[hi]){
                lo = mid+1;
            }else{
                hi = mid-1;
            }
        }
        return min;
    }
}