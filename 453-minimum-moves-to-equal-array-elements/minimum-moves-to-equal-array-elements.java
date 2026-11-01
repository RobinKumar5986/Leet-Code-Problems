class Solution {
    public int minMoves(int[] nums) {
        int min = nums[0];
        for(int ele : nums)
            min = Math.min(ele,min);
        int ans = 0;
        for(int ele : nums){
            ans += ele - min;
        }
        return ans;
    }
}