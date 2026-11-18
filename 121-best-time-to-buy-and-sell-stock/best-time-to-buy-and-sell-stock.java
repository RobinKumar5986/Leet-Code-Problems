class Solution {
    public int maxProfit(int[] pri) {
        int[] max = new int[pri.length];
        int m = Integer.MIN_VALUE;
        for(int i = pri.length-1; i >= 0; i--){
            m = Math.max(m,pri[i]);
            max[i] = m;
        }
        int ans = 0;
        for(int i = 0; i < pri.length; i++){
            int profit = max[i] - pri[i];
            ans = Math.max(ans,profit);
        }
        return ans;
    }
}