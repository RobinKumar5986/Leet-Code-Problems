class Solution {
    boolean isOk(int n , int[] nums , int mOp){
        int total = 0;
        for(int num : nums){
            int rem = (int)Math.ceil((double)num/n) - 1;
            total += rem;
            if(total > mOp)
                return false;
        }
        return true;
    }
    public int minimumSize(int[] nums, int mOp) {
        int hi = -1;
        for(int ele : nums)
            hi = Math.max(ele,hi);
        int ans = hi;
        int lo = 1;
        while(lo <= hi){
            int mid = (lo+hi)/2;
            if(isOk(mid,nums,mOp)){
                ans = Math.min(ans,mid);
                hi = mid - 1;
            }else{
                lo = mid+1;
            }
        }
        return ans;
    }
}