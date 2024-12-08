class Solution {
    boolean isOk(int n , int[] nums,int mOp){
        int sum = 0;
        for(int ele: nums){
            int rem = (int)Math.ceil((double)ele/n) - 1;
            sum += rem;
            if(sum > mOp)
                return false;
        }
        return true;
    }
    public int minimumSize(int[] nums, int mOp) {
        int hi = -1;
        for(int ele : nums )
            hi = Math.max(hi,ele);
        int ans = hi;
        int lo = 1;
        while(lo <= hi){
            int mid = lo + (hi - lo) / 2;
            if(isOk(mid,nums,mOp)){
                ans = mid;
                hi = mid - 1;
            }else{
                lo = mid + 1;
            }
        }
        return ans;
    }
}