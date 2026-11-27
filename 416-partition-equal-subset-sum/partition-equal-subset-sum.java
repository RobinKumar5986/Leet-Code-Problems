class Solution {
    Boolean[][] dp;
    boolean ans = false;
    boolean dfs(int ind,int[] nums,int rem){
        if(ans)return ans;
        if(rem == 0) return true;
        if(rem < 0) return false;
        if(ind >= nums.length) return false;
        
        if(dp[ind][rem] != null){
           return dp[ind][rem];
        }
        
        //case not include
        boolean c1 = dfs(ind+1,nums,rem);
        //include
        boolean c2 = dfs(ind+1,nums,rem - nums[ind]);
        boolean reach = c1 || c2;

        ans = reach;
        dp[ind][rem] = reach;
        return reach;
    }
    public boolean canPartition(int[] nums) {
        int total = 0;
        for(int ele : nums) total += ele;
        if(total % 2 != 0) return false;
        dp = new Boolean[nums.length][total/2 + 1];
        return dfs(0,nums,total/2);
    }
}