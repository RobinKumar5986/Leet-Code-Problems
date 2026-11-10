class Solution {
    public boolean search(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length-1;

        while(lo <= hi) {
            int mid = (lo + hi)/2;
            if(nums[mid] == target){
                return true;
            }else{
                    
                if(nums[lo]==nums[hi]){
                    if(nums[lo]==target) return true;
                    
                    lo++;
                    hi--;
                }
                else if(nums[hi] >= nums[mid]){ // rigth side sorted
                    if(target <= nums[hi] && target > nums[mid]){
                        lo = mid+1;
                    }else{
                        hi = mid-1;
                    }
                }else{ //left side sorted
                    if(target >= nums[lo] && target < nums[mid] ){
                        hi = mid - 1;
                    }else{
                        lo = mid+1;
                    }
                }
            }
        }

        return false;
    }
}