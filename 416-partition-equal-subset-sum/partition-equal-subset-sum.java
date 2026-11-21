class Solution {
    Boolean[][] dp;
    boolean ans = false;
    boolean dfs(int ind,int[] nums,int total,int sum){
        if(ans)return ans;
        if(sum == total/2) return true;
        if(ind >= nums.length) return false;
        if(dp[ind][sum] != null){
           return dp[ind][sum];
        }
        
        //case not include
        boolean c1 = dfs(ind+1,nums,total,sum);
        //include
        boolean c2 = dfs(ind+1,nums,total,sum + nums[ind]);
        boolean reach = c1 || c2;

        ans = reach;
        if(reach)
            dp[ind][sum] = true;
        else
            dp[ind][sum] = false;
        
        return reach;
    }
    public boolean canPartition(int[] nums) {
        int total = 0;
        for(int ele : nums) total += ele;
        if(total % 2 != 0) return false;
        dp = new Boolean[nums.length][total + 1];
        return dfs(0,nums,total,0);
    }
}