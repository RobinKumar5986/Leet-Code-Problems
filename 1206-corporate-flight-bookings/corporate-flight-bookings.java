class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] marker = new int[n+2];
        int[] ans = new int[n];

        for(int[] b : bookings){
            marker[b[0]] += b[2];
            marker[b[1]+1] -= b[2]; 
        }
        int sum = 0;
        for(int i = 0,ind = 1; i < n; i++,ind++){
            sum += marker[ind];
            ans[i] = sum;
        }
        return ans;
    }
}