class Solution {
    boolean checkIfOk(int[][] queries,int[] nums, int k){
        int[] diff = new int[nums.length+1];
        for(int i = 0 ; i <= k ; i++){
            int[] ele = queries[i];
            diff[ele[0]] += ele[2];
            diff[ele[1]+1] -= ele[2];
        }
        int cur = 0;
        for(int i = 0 ; i < nums.length ; i++){
            cur += diff[i];
            if(nums[i] - cur > 0)
                return false;
        }
        return true;
    }
    public int minZeroArray(int[] nums, int[][] queries) {
        boolean flag = true;
        for(int ele : nums){
            if(ele > 0){
                flag = false;
                break;
            }
        }
        if(flag)
            return 0;
        int lo = 0;
        int hi = queries.length-1;
        int k = -1;
        while(lo <= hi){
            int mid = (lo + hi)/2;
            if(checkIfOk(queries,nums,mid)){
                k = mid+1;
                hi = mid-1;
            }else{
                lo = mid+1;
            }
        }
        return k;
    }
}