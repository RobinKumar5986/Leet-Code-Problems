//------------Brute force Less optmize solution-------------//
// class Solution {
//     int[] rods;
//     int n;

//     public int tallestBillboard(int[] rods) {
//         this.rods=rods;
//         this.n=rods.length;
//         return solve(0,0,0);
//     }
//     public int solve(int i,int s1,int s2){
//         if(i==n)
//         {
//             if(s1==s2) return s1;
//             return 0;
//         }

//         int ans=0;
//         int op1=solve(i+1,s1,s2);
//         int op2=solve(i+1 , s1+rods[i] , s2);
//         int op3=solve(i+1 , s1 , s2+rods[i]);
//         return ans=Math.max(Math.max(op1,op2),op3);
//     }
// }

class Solution {
    public int tallestBillboard(int[] rods) {
        int[] dp = new int[5001];
        for (int d = 1; d < 5001; d++) dp[d] = -10000;
        for (int x : rods) {
            int[] cur = dp.clone();
            for (int d = 0; d + x < 5001; d++) {
                dp[d + x] = Math.max(dp[d + x], cur[d]);
                dp[Math.abs(d - x)] = Math.max(dp[Math.abs(d - x)], cur[d] + Math.min(d, x));
            }
        }
        return dp[0];
    }
}