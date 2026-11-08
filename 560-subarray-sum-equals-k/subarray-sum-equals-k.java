class Solution {
    public int subarraySum(int[] nums, int k) {
        int ans = 0;
        for (int lo = 0; lo < nums.length; lo++) {
            int sum = 0;
            for (int hi = lo; hi < nums.length; hi++) {
                sum += nums[hi];
                if (sum == k) ans++;
            }
        }
        return ans;
    }
}