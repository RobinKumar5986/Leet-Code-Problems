class Solution {
    boolean isOk(int n, int[] nums, int mOp) {
        for (int ele : nums) {
            int operations = (ele + n - 1) / n - 1;
            mOp -= operations;
            if (mOp < 0)
                return false;
        }
        return true;
    }
    public int minimumSize(int[] nums, int mOp) {
        int hi = -1;
        for(int i: nums){
            if(hi < i) hi = i;
        }
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