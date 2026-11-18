class Solution {
    public int[] searchRange(int[] nums, int t) {
        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;

        //first bin search to go to max ind
        int lo = 0;
        int hi = nums.length-1;
        while(lo <= hi){
            int mid = (lo + hi )/2;
            if(nums[mid] == t){
                ans[1] = mid;
                lo = mid + 1;
            }else if(nums[mid] < t){
                lo = mid + 1;
            }else{
                hi = mid - 1;
            }
        }
        if(ans[1] == -1)
            return ans;

        //second pass for getting min ind
        lo = 0;
        hi = nums.length-1;
        while(lo <= hi){
            int mid = (lo + hi )/2;
            if(nums[mid] == t){
                ans[0] = mid;
                hi = mid - 1;
            }else if(nums[mid] < t){
                lo = mid + 1;
            }else{
                hi = mid - 1;
            }
        }
        return ans;
    }
}