class Solution {
    public int[] twoSum(int[] nums, int tar) {
        int lo = 0;
        int hi = nums.length-1;
        int ans[] = new int[2];
        while(lo  <  hi) {
            int sum = nums[lo] + nums[hi];
            if(sum == tar){
                ans[0] = lo+1;
                ans[1] = hi+1;
                break;
            }
            if(sum > tar){
                hi--;
            }else{
                lo++;
            }
        }

        return ans;
    }
}