class Solution {
    public int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int curSum = 0;
        for(int ele : nums) {
            curSum = Math.max(ele, curSum + ele);
            ans = Math.max(curSum, ans);
        }

        return ans;
    }
}