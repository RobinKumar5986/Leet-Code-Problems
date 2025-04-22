class Solution {
  
    public int minCostClimbingStairs(int[] cost) {
        int one = cost[0];
        int two = cost[1];
        int ans = 0;
        for(int i = 2; i < cost.length; i++){
            ans = cost[i] + Math.min(one,two);
            one = two;
            two = ans;
        }
        ans = Math.min(one,two);
        return ans;
    }
}