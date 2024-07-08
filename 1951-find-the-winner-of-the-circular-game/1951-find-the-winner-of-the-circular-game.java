class Solution {
   
    public int findTheWinner(int n, int k) {
        int val=0;
        for(int i=2;i<=n;i++){
            val=(val+k)%i;
        }
        return val+1;
    }
}