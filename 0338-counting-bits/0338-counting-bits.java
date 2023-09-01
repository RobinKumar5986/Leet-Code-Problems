class Solution {
    // int binCount(int n){
    //     int count=0;
    //     while(n!=0){
    //         int rem=n%2;
    //         if(rem==1) count++;
    //         n=n/2;
    //     }
    //     return count;
    // }
    public int[] countBits(int n) {
        int ans[]=new int[n+1];
        ans[0]=0;
        for(int i=1;i<=n;i++){
            if(i%2==1){
                ans[i]=ans[i>>1]+1;
            }else{
                ans[i]=ans[i>>1];
            }
        }
        return ans;
    }
}