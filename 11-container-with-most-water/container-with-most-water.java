class Solution {
    public int maxArea(int[] nums) {
        int lo = 0;
        int hi = nums.length-1;
        int ans = 0;

        while( lo < hi ) {
            int min = Math.min(nums[lo], nums[hi]);
            ans = Math.max(ans, min * (hi - lo));
            if(nums[hi] < nums[lo]){
                hi--;
            }else{
                lo++;
            }
        }
        return  ans;
    }
}