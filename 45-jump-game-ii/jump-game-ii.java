class Solution {
    int[] dp;
    int max_jum = 1_000_00;
    int dfs(int ind, int[] nums){
        if(ind == nums.length-1)
            return 0;
        if(ind >= nums.length)
            return max_jum;
        if(dp[ind] != -1)
            return dp[ind];
        int minJump = max_jum;

        for(int i = 1; i <= nums[ind] ; i++ ){
            int jump = 1 + dfs(ind + i, nums);
            minJump = Math.min(minJump,jump);
        }
        dp[ind] = minJump;
        return minJump;
    }
    public int jump(int[] nums) {
        dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return dfs(0,nums);
    }
}