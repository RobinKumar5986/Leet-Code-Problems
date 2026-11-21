class Solution {
    int[][] dp;
    
    boolean ans = false;
    boolean dfs(int ind,int[] nums,int total,int sum){
        if(ans) return true;
        if(sum == total/2) return true;
        if(ind >= nums.length) return false;
        
        if(dp[ind][sum] != -1){
           if(dp[ind][sum] == 0) return false;
           return true;
        }
        
        //case not include
        boolean c1 = dfs(ind+1,nums,total,sum);
        //include
        boolean c2 = dfs(ind+1,nums,total,sum + nums[ind]);
        boolean reach = c1 || c2;


        if(reach){
            ans = true;
            dp[ind][sum] = 1;
        }else{
            dp[ind][sum] = 0;
        }
        return reach;
    }
    public boolean canPartition(int[] nums) {
        int total = 0;
        for(int ele : nums) total += ele;
        if(total % 2 != 0) return false;
        dp = new int[nums.length][total + 1];
        for(int i = 0 ; i  < dp.length; i++){
            for(int j = 0 ; j < dp[0].length; j++){
                dp[i][j] = -1;
            }
        }
        return dfs(0,nums,total,0);
    }
}