class Solution {
    int[] dp;

    int sol(int[] nums,int i){
        if(i < 0 )
            return 0;
        if(dp[i] != -1)
            return dp[i];
        dp[i] = Math.max(nums[i] + sol(nums,i-2), sol(nums,i-1) );

        return dp[i];
    }
    public int rob(int[] nums) {
        dp = new int[nums.length];
        for(int i = 0 ; i < nums.length; i++)
            dp[i] = -1;
        return sol(nums,nums.length-1);
    }
}